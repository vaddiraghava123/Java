package com.vaddi.java.dependencyInjection;

import java.util.Arrays;
import java.util.List;

public class IndianUserInfoRepository implements UserRepository{

	List<User> userList = Arrays.asList(new User("Raghava","Vaddi"),
			new User("Sake","Thulasi"),
			new User("Oorvi Nandan Jaswik","Vaddi"));
	
	
	public List<User> findAllUsers(){
		return userList;
	}
}
