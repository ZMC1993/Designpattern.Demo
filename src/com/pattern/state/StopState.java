package com.pattern.state;

public class StopState implements State {

	@Override
	public void doActoin(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Context is do action in stop state");
		context.setState(this);
	}
	public String toString() {
		return "Stop state";
	}

}
