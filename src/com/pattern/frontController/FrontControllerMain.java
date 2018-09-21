package com.pattern.frontController;

public class FrontControllerMain {
	public static void main(String[] args) {
		FrontController fc=new FrontController();
		fc.dispatchRequest("student");
		fc.dispatchRequest("home");
	}
}
