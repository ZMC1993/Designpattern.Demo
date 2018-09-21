package com.pattern.mediator;

public class MediatorMain {
	public static void main(String[] args) {
		User jams=new User("jams");
		User bella=new User("bella");
		bella.showMessage("hello");
		jams.showMessage("hi");
	}
}
