package com.pattern.frontController;

public class FrontController {
	private Dispatcher dispather=new Dispatcher();
	
	private boolean isAuthenticUser() {
		System.out.println("User authentic is success");
		return true;
	}
	
	private void trackRequest(String request) {
		System.out.println("Request is :"+request);
	}
	
	public void dispatchRequest(String request) {
		trackRequest(request);
		
		if(isAuthenticUser()) {
			dispather.dispatch(request);
		}
		
	}
}
