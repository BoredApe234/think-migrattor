package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mps.think.setup.service.CountriesService;
import com.mps.think.setup.vo.CountriesVO;

@RestController
@CrossOrigin
public class CountriesController {
	
	@Autowired
	CountriesService countriesService;
	
	@GetMapping("/getAllCountries")
	public ResponseEntity<?> getAllCountries() {
		return ResponseEntity.ok(countriesService.getAllCountries());
	}
	
	@PostMapping("/saveCountries")
	public ResponseEntity<?> saveCountries(@RequestBody CountriesVO id) {
		return ResponseEntity.ok(countriesService.saveCountries(id));
	}
	
	@PostMapping("/updateCountries")
	public ResponseEntity<?> updateCountries(@RequestBody CountriesVO id) {
		return ResponseEntity.ok(countriesService.updateCountries(id));
	}
	
	@PostMapping("/findbyCountriesId")
	public ResponseEntity<?> findbyCountriesId(@RequestBody Integer id) {
		return ResponseEntity.ok(countriesService.findbyCountriesId(id));
	}
	
	@DeleteMapping("/deleteByCountriesId")
	public ResponseEntity<?> deleteByCountriesId(@RequestBody Integer id) {
		return ResponseEntity.ok(countriesService.deleteByCountriesId(id));
	}

	@PostMapping("/getAllCountriesForPublisher")
	public ResponseEntity<?> findAllCountriesForPublisher(@RequestBody Integer pubId) {
		return ResponseEntity.ok(countriesService.findAllCountriesForPublisher(pubId));
	}

}
