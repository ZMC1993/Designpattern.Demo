package com.pattern.memento;

public class MementoMain {
	public static void main(String[] args) {
		Originator o=new Originator("state1");
		CareTake ct=new CareTake();
		ct.add(o.saveStateToMemneto());
		o.setState("state2");
		ct.add(o.saveStateToMemneto());
		o.setState("state3");
		ct.add(o.saveStateToMemneto());
		o.getStateFromMemento(ct.getMemento(0));
		System.out.println(o.getState());
		
	}
}
