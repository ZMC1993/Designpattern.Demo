package com.pattern.responsibilityChain;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		super(level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("ErrorLogger write the message: "+message);
	}

}
