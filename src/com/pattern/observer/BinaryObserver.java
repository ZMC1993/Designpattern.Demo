package com.pattern.observer;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}
	@Override
	void update() {
		// TODO Auto-generated method stub
		System.out.println("BinaryObserver receive the state:"
		+Integer.toBinaryString(this.subject.getState()));
	}

}
