package com.techment.dto;

public class UserDto {

	//private int id;
	
	
	
	private String username;
	//private String password;
	private String token;
	
	public UserDto() {
		super();
	}

	
	  public UserDto(String username, String token) { super(); this.username =
	  username; this.token = token; }
	 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}
	
	
	
	
	
	
	
}
