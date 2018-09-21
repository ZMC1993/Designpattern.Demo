package com.pattern.interceptingFilter;

public class DebugFilter implements Filter {

	@Override
	public void execute(String request) {
		// TODO Auto-generated method stub
		System.out.println("Request log is :"+request);		
	}

}
