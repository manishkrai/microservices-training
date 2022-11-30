package com.fis.training.microservices.userservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.training.microservices.userservice.entity.User;
import com.fis.training.microservices.userservice.service.UserService;

@RestController
@RequestMapping("users")
public class UserControllers {

	@Autowired
	private UserService userService;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Integer userId) {		
		return this.userService.getUser(userId);
	}
	
	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {	
		User savedUser = null;
		HttpStatus status = HttpStatus.CREATED;
		try {
			savedUser = this.userService.saveUser(user);
		}
		catch (Exception e) {
			status = HttpStatus.CONFLICT;
		}
		
		return new ResponseEntity<>(savedUser, status);
	}
}
