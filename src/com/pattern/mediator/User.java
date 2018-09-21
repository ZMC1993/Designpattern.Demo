package com.pattern.mediator;

public class User {
	private String name;
	public User(String name) {
		this.name=name;
		chatroom=new ChatRoom();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private ChatRoom chatroom;
	public void showMessage(String message) {
		chatroom.showMessage(this, message);
	}
}
