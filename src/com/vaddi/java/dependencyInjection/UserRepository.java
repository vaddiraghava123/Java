package com.vaddi.java.dependencyInjection;

import java.util.List;

public interface UserRepository {
	public List<User> findAllUsers();
}
