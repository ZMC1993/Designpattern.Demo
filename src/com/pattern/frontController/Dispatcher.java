package com.pattern.frontController;

public class Dispatcher {
	private HomeView homeView=new HomeView();
	private StudentView studentView=new StudentView();
	
	public void dispatch(String request) {
		if(request.equalsIgnoreCase("student")) {
			studentView.show();
		}
		else {
			homeView.show();
		}
	}
}
