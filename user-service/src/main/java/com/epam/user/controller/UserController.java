package com.epam.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.user.entity.UserDetail;
import com.epam.user.service.UserDetailService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/user")
@RestController
@Slf4j
public class UserController {
	
	private static final String CLASS_NAME = "UserController";
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserDetailService userDetailService;
	
	@PostMapping("/")
	public UserDetail saveUserInfo(@RequestBody UserDetail user) {
		final String METHOD_NAME = "saveUserInfo"; 
		log.info("INSIDE CLASS "+ CLASS_NAME + " INSIDE METHOD " + METHOD_NAME);

		return userDetailService.saveUserInfo(user);	
		
	}
	
	@GetMapping("/{userName}")
	public UserDetail getUserInfoByUserName(@PathVariable("userName") String userName) {
		final String METHOD_NAME = "getUserInfoByUserName"; 
		log.info("INSIDE CLASS "+ CLASS_NAME + " INSIDE METHOD " + METHOD_NAME);

		return userDetailService.getUserInfo(userName);
	}

}
