package com.fis.training.microservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	
}
