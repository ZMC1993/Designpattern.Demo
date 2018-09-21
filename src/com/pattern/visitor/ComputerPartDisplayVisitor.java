package com.pattern.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		// TODO Auto-generated method stub
		System.out.println("Display the computer");
	}

	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("Display the mouse");
	}

	@Override
	public void visit(Keyboard keyboard) {
		// TODO Auto-generated method stub
		System.out.println("Display the keyboard");
	}

	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("Display the monitor");
	}

}
