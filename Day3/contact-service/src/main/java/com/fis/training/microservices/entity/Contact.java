package com.fis.training.microservices.entity;

public class Contact {

	private Integer contactId;
	private String contactName;
	private String email;
	private Integer userId;
	
	public Contact(Integer contactId, String contactName, String email, Integer userId) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.email = email;
		this.userId = userId;
	}

	public Integer getContactId() {
		return contactId;
	}
	
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	
	public String getContactName() {
		return contactName;
	}
	
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
