package com.fis.training.microservices.userservice.service;

import org.springframework.stereotype.Service;

import com.fis.training.microservices.userservice.entity.User;

public interface UserService {

	User getUser(Integer userId);
}
