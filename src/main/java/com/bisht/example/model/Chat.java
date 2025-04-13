package com.bisht.example.model;

public class Chat {

	private String user;
	private String message;
	
	public Chat() {
		
	}

	public Chat(String user, String message) {
		super();
		this.user = user;
		this.message = message;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Chat [user=" + user + ", message=" + message + "]";
	}

}
