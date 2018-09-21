package com.pattern.serviceLocator;

public class ServiceLocatorMain {
	public static void main(String[] args) {
		Service s=ServiceLocator.getService("Service1");
		s.execute();
		s=ServiceLocator.getService("Service2");
		s.execute();
		s=ServiceLocator.getService("Service1");
		s.execute();
		s=ServiceLocator.getService("Service2");
		s.execute();
	}
	
}
