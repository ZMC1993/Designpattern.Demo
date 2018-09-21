package com.pattern.bridge;

public class BridgeMain {
	public static void main(String[] args) {
		Shape s1=new Circle(1,2,4,new RedDraw());
		Shape s2=new Circle(2,3,6,new BlueDraw());
		s1.Draw();
		s2.Draw();
	}
}
