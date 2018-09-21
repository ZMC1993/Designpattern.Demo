package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private int state;
	private List<Observer> observers=new ArrayList<Observer>();
	
	public Subject(int state) {
		this.state=state;
	}
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	public void notifyAllObserver() {
		for(Observer o:observers) {
			o.update();
		}
	}
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObserver();
	}
	
}
