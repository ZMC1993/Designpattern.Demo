package com.pattern.observer;

public class HexaObserver extends Observer {
	public HexaObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}
	
	@Override
	void update() {
		// TODO Auto-generated method stub
		System.out.println("HexaObserver is receive the state :"
		+Integer.toHexString( this.subject.getState()));
	}

}
