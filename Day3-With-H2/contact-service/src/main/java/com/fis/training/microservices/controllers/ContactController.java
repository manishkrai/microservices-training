package com.fis.training.microservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fis.training.microservices.entity.Contact;
import com.fis.training.microservices.services.ContactService;

@RestController
@RequestMapping("contacts")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Integer userId) {
		
		return this.contactService.getContacts(userId);
	}
	
	@PostMapping("/saveContact")
	public ResponseEntity<Contact> saveUser(@RequestBody Contact contact) {	
		Contact savedContact = null;
		HttpStatus status = HttpStatus.CREATED;
		try {
			savedContact = this.contactService.saveContact(contact);
		}
		catch (Exception e) {
			status = HttpStatus.CONFLICT;
		}
		
		return new ResponseEntity<>(savedContact, status);
	}

	
}
