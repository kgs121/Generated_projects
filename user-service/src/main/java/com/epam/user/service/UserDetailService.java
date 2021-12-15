package com.epam.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.epam.user.entity.UserDetail;
import com.epam.user.repository.UserDetailRepository;

@Service
public class UserDetailService {
	
	private static final String CLASS_NAME = "UserDetailService";
	
	private static final Logger log = LoggerFactory.getLogger(UserDetailService.class);

	@Autowired
	private UserDetailRepository userDetailRepository;
	
	public UserDetail saveUserInfo(UserDetail user) {
		final String METHOD_NAME = "saveUserInfo"; 
		log.info("INSIDE CLASS "+ CLASS_NAME + " INSIDE METHOD " + METHOD_NAME);

		return userDetailRepository.save(user);	
		
	}
	
	public UserDetail getUserInfo(String userName) {
		final String METHOD_NAME = "getUserInfo"; 
		log.info("INSIDE CLASS "+ CLASS_NAME + " INSIDE METHOD " + METHOD_NAME);		
		return userDetailRepository.findUserDetailByUserName(userName);
		
	}

}
