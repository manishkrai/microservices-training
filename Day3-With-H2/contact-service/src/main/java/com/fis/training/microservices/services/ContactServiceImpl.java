package com.fis.training.microservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.training.microservices.entity.Contact;
import com.fis.training.microservices.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;	
	
	@Override
	public List<Contact> getContacts(Integer userId) {
		return contactRepository.findByUserId(userId);
	}

	@Override
	public Contact saveContact(Contact contact) {
		return contactRepository.save(contact);
	}
}
