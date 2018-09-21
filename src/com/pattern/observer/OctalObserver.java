package com.pattern.observer;

public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}
	
	@Override
	void update() {
		// TODO Auto-generated method stub
		System.out.println("OctalObserver is receive the state :"
		+Integer.toOctalString(this.subject.getState()));
	}

}
