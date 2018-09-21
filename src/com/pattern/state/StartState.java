package com.pattern.state;

public class StartState implements State {

	@Override
	public void doActoin(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Context is do action in start state");
		context.setState(this);
	}
	
	public String toString() {
		return "Start state";
	}

}
