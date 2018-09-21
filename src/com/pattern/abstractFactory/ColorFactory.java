package com.pattern.abstractFactory;

public class ColorFactory implements AbstractFactory {
	public Color getColor(String colorType) {
		switch(colorType) {
		case"Blue":{
			return new Blue();
		}
		case"Red":{
			return new Red();
		}
		case"Black":{
			return new Black();
		}
		default:{
			return null;
		}
		}
	}
	public Shape getShape(String shapeType)
	{
		return null;
	}
}
