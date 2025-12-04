package com.demo.MiniProject2;

public class LoginCheck {
	private final UsersData data;

	public LoginCheck(UsersData data) {
		this.data = data;
	}

	public boolean login(String username, String password) {
		return data.validateUser(username, password);
	}

}
