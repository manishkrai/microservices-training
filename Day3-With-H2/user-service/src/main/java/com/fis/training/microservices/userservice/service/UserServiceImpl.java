package com.fis.training.microservices.userservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fis.training.microservices.userservice.entity.Contact;
import com.fis.training.microservices.userservice.entity.User;
import com.fis.training.microservices.userservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private UserRepository userRepository;
			
	@Override
	public User getUser(Integer userId) {
		Contact[] contacts = this.restTemplate.getForObject("http://localhost:9002/contacts/" + userId, Contact[].class);
		User user = userRepository.findById(userId).orElse(null);
		if(user != null) {
			user.setContacts(Arrays.asList(contacts));
		}
		return user;
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);		
	}
}
