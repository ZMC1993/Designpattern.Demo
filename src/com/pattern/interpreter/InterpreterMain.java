package com.pattern.interpreter;

public class InterpreterMain {
	public static void main(String[] args) {
		System.out.println(getMaleExpression().interpret("woman no marry male"));
		System.out.println(new AndExpression(getMaleExpression(),getMarriedExpression()).interpret(" male is on marry"));
		
		
	}
	
	private static Expression getMaleExpression() {
		return new TerminalExpression("male");
	}
	
	private static Expression getMarriedExpression() {
		return new TerminalExpression("married");
	}
}
