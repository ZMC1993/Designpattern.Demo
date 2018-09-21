package com.pattern.abstractFactory;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		AbstractFactory af=FactoryProvide.getAbstractFactory("Color");
		Color red=af.getColor("Red");
		red.fill();
	}
}
