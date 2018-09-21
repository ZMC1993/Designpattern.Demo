package com.pattern.strategy;

public class StrategyMain {
	public static void main(String[] args) {
		Context c=new Context(new OperationAdd());
		System.out.println(c.doOperation(5, 10));
		c=new Context(new OperationMultiply());
		System.out.println(c.doOperation(10, 5));
		c=new Context(new OperationSubstract());
		System.out.println(c.doOperation(20, 2));
	}
}
