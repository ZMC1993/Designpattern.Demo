package com.pattern.memento;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public Originator(String state) {
		this.state = state;
	}

	public Memento saveStateToMemneto() {
		return new Memento(this.state);
	}
	
	public void getStateFromMemento(Memento memento) {
		this.state=memento.getState();
	}
}
