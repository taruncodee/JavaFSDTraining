package com.main;

public class User implements IValidate {
	private String userId;
	private String password;

	@Override
	public boolean isAuthenticated(String userId, String password) {
		return (this.userId.compareTo(userId) == 0 && this.password.compareTo(password) == 0);
	}

	public User() {
		super();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + "]";
	}
	
	public void addUser(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
}
