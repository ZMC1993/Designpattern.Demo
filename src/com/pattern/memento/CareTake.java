package com.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTake {
	private List<Memento> mementos=new ArrayList<Memento>();
	public void add(Memento memento) {
		mementos.add(memento);
	}
	public Memento getMemento(int index) {
		return mementos.get(index);
	}
}
