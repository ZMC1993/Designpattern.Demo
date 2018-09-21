package com.pattern.responsibilityChain;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		super(level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("ConsoleLogger is write the message: "+message);
	}

}
