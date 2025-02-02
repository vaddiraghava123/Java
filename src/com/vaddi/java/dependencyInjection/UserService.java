package com.vaddi.java.dependencyInjection;

import java.util.List;

public class UserService {
	
//	private IndianUserInfoRepository indianUserInfoRepository;
	private UserRepository userRepository;
	/*
	 * public UserService(){ userRepository = new IndianUserInfoRepository(); }
	 */
	
	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getAllUsers(){
		return userRepository.findAllUsers();
	}
}
