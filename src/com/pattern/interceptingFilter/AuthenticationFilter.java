package com.pattern.interceptingFilter;

public class AuthenticationFilter implements Filter {

	@Override
	public void execute(String request) {
		// TODO Auto-generated method stub
		System.out.println("AuthenticationFilter is filter request:"+request);		
	}

}
