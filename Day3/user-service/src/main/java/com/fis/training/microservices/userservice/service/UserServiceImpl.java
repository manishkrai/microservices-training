package com.fis.training.microservices.userservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fis.training.microservices.userservice.entity.Contact;
import com.fis.training.microservices.userservice.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private List<User> users = List.of(
			new User(1001, "Ram Sharma", "1234567"),
			new User(1002, "Test User", "43254567")
			);
	
	@Override
	public User getUser(Integer userId) {
		Contact[] contacts = this.restTemplate.getForObject("http://localhost:9002/contacts/" + userId, Contact[].class);
		User user = users.stream().filter(x-> x.getId().equals(userId)).findFirst().orElse(null);
		if(user != null) {
			user.setContacts(Arrays.asList(contacts));
		}
		return user;
	}

}
