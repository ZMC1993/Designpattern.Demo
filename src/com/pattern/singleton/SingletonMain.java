package com.pattern.singleton;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton s=Singleton.getInstance();
		s.showMessage();
	}
}
