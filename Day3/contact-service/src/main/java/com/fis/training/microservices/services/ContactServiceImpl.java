package com.fis.training.microservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fis.training.microservices.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	private List<Contact> contacts = List.of(
			new Contact(2001, "Ram", "Ram@gmail.com", 1001),
			new Contact(2002, "Ram Sharma", "RamTest@gmail.com", 1001),
			new Contact(2003, "Test", "Test@gmail.com", 1002)
			);

	@Override
	public List<Contact> getContacts(Integer userId) {
		return this.contacts.stream().filter(x-> x.getUserId().equals(userId)).toList();
	}
}
