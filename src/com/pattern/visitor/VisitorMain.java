package com.pattern.visitor;

public class VisitorMain {
	public static void main(String[] args) {
		Computer c=new Computer();
		c.accept(new ComputerPartDisplayVisitor());
	}
}
