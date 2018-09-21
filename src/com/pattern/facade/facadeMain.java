package com.pattern.facade;

public class facadeMain {
	public static void main(String[] args) {
		ShapeMaker sm=new ShapeMaker();
		sm.drawCircle();
		sm.drawRectangle();
		sm.drawSquare();
	}
}
