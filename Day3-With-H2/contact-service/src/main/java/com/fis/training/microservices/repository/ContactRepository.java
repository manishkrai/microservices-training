package com.fis.training.microservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.training.microservices.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	List<Contact> findByUserId(Integer userId);

}
