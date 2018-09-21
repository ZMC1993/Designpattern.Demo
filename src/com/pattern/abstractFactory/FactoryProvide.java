package com.pattern.abstractFactory;

public class FactoryProvide {
	public static AbstractFactory getAbstractFactory(String factoryType) {
		switch(factoryType) {
		case"Color":{
			return new ColorFactory();
		}
		case"Shape":{
			return new ShapeFactory();
		}
		default:{
			return null;
		}
		}
	}
}
