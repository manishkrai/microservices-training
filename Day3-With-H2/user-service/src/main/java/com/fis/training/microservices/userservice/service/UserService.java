package com.fis.training.microservices.userservice.service;

import com.fis.training.microservices.userservice.entity.User;

public interface UserService {

	User getUser(Integer userId);
	User saveUser(User user);	
}
