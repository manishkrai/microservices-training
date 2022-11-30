package com.fis.training.microservices.services;

import java.util.List;


import com.fis.training.microservices.entity.Contact;

public interface ContactService {

	List<Contact> getContacts(Integer userId);
	
	Contact saveContact(Contact contact);
}
