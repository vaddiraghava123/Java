package com.vaddi.java.dependencyInjection;

import java.util.Arrays;
import java.util.List;

public class USAUserInfoRepository implements UserRepository{

	List<User> userList = Arrays.asList(new User("John","Bob"),
			new User("Pope","Jerry"),
			new User("Kate","Mike"));
	
	
	public List<User> findAllUsers(){
		return userList;
	}
}
