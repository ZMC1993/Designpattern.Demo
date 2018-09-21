package com.pattern.responsibilityChain;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		super(level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("FileLogger is write message: "+message);
	}

}
