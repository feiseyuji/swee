package com.swee.provider.project.core.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swee.provider.project.core.model.User;

@RestController
public class UserController {
	
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User findUser(@PathVariable("userId") Integer userId) {
		return User.builder().id(userId).name("swee").build();
	}
}
