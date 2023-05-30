package com.mps.think.setup.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mps.think.setup.utils.ReadCSVDataAvalara;

//import com.mps.think.setup.utils.StorageService;

@RestController
@CrossOrigin
public class FileUploadController {
	 @Value("${csv.movelocation}")
	    String movelocation;
	
	@PostMapping("/avalara/fileupload")
	public String handleFileUpload(@RequestParam("file") MultipartFile file) {

//		storageService.store(file);
		System.out.println("message You successfully uploaded " + file.getOriginalFilename() + "!");
		File file1 = new File(movelocation+file.getOriginalFilename());
		try {
			file.transferTo(file1);
			ReadCSVDataAvalara.readDataLineByLine(file1.getAbsolutePath());
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "done ";
	}

}
