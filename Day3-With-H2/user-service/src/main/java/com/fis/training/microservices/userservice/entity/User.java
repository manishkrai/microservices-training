package com.fis.training.microservices.userservice.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "USERS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "CONTACT_NUMBER")
	private String contact;
	
	@Transient
	private List<Contact> contacts;
	
	public Integer getId() {
		return id;
	}
	
	public User() {
		super();
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
