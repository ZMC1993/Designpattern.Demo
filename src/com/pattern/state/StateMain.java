package com.pattern.state;

public class StateMain {
	public static void main(String[] args) {
		Context c=new Context();
		StartState start=new StartState();
		StopState stop=new StopState();
	
		start.doActoin(c);
		System.out.println(c.getState().toString());
		stop.doActoin(c);
		System.out.println(c.getState().toString());
	}
}
