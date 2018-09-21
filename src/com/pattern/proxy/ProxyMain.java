package com.pattern.proxy;

public class ProxyMain {
	public static void main(String[] args) {
		Image image=new ProxyImage("1.jpg");
		image.display();
		image.display();
	}
}
