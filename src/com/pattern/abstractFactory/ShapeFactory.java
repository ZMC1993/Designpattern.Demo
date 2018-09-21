package com.pattern.abstractFactory;

public class ShapeFactory implements AbstractFactory {
	public Shape getShape(String shapeType)
	{
		switch(shapeType) {
		case"Rectangle":{
			return new Rectangle();
		}
		case"Square":{
			return new Square();
		}
		case"Circle":{
			return new Circle();
		}
		default:{
			return null;
		}
		}
	}
	public Color getColor(String colorType) {
		return null;
	}
}
