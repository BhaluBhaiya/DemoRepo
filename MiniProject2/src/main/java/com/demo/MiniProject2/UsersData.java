package com.demo.MiniProject2;

import java.util.HashMap;
import java.util.Map;

public class UsersData {
	private final Map<String, String> users = new HashMap<String, String>();
	
	public UsersData() {
		users.put("Admin", "admin@123");
	}
	
	public boolean validateUser(String user , String pass) {
		String current = users.get(user);
		return current !=null && current.equals(pass);
	}
	
	public void createUser(String username , String password) {
		if(username == null || username.isBlank())
			throw new IllegalArgumentException("Username required");
		
		if(users.containsKey(username))
			throw new IllegalArgumentException("Username already exists");
		
		users.put(username, password);
	}
	
	public boolean deleteUser(String username) {
		return users.remove(username) != null;
	}
	
}
