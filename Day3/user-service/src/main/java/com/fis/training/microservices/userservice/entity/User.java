package com.fis.training.microservices.userservice.entity;

import java.util.List;

public class User {

	private Integer id;
	private String name;
	private String contact;
	private List<Contact> contacts;
	
	public Integer getId() {
		return id;
	}
	
	public User(Integer id, String name, String contact, List<Contact> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.contacts = contacts;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}

	public User(Integer id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
}
