package com.mps.think.setup.sorl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.service.CustomerDetailsService;

/**
 * Created by @rohit.
 */
@RestController
@CrossOrigin
public class SolrDocumentController {
	@Autowired
	private DocumentRepository documentRepository;
	
	@Autowired
	private CustomerDetailsService customerDetailsService;

	@RequestMapping("/")
	public String SpringBootSolrExample() {
		return "Welcome to Spring Boot solr Example";
	}

	@GetMapping("/delete")
	public String deleteAllDocuments() {
		try { // delete all documents from solr core
			documentRepository.deleteAll();
			return "documents deleted succesfully!";
		} catch (Exception e) {
			return "Failed to delete documents";
		}
	}

	@GetMapping("/save")
	public String saveAllDocuments() {
		// Store Documents
		documentRepository.saveAll(Arrays.asList(new Document("1", "pdf", "Java Dev Zone"),
				new Document("2", "msg", "subject:reinvetion"), new Document("3", "pdf", "Spring boot sessions"),
				new Document("4", "docx", "meeting agenda"), new Document("5", "docx", "Spring boot + solr")));
		return "5 documents saved!!!";
	}

	@GetMapping("/getAll")
	public List<Document> getAllDocs() {
		List<Document> documents = new ArrayList<>();
		// iterate all documents and add it to list
		for (Document doc : this.documentRepository.findAll()) {
			documents.add(doc);
		}
		return documents;
	}

	@GetMapping("/saveCustomerDetails")
	public String CustomerDetailsDocuments() {
		// Store Documents
		List<CustomerDetails> cust = customerDetailsService.getAllCustomerDetails();

		// documentRepository.saveAll(Arrays.asList(new Document("CustomerDetails",
		// "customer", cust.toString())));
		for (CustomerDetails customerDetails : cust) {
			documentRepository.save(new Document("CustomerDetails" + customerDetails.getCustomerId(),
					"customer" + customerDetails.getCustomerId(), customerDetails.toString()));
		}

		return "CustomerDetails saved!!!";
	}
}