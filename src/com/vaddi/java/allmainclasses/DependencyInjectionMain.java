package com.vaddi.java.allmainclasses;

import java.util.List;

import com.vaddi.java.dependencyInjection.USAUserInfoRepository;
import com.vaddi.java.dependencyInjection.User;
import com.vaddi.java.dependencyInjection.UserService;

public class DependencyInjectionMain {

	public static void main(String...args) {

		UserService userService = new UserService();
		userService.setUserRepository(new USAUserInfoRepository());
		List<User> usersList = userService.getAllUsers();
		usersList.stream().forEach(System.out::println);

	}
}
