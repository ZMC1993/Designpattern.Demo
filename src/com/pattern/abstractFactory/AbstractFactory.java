package com.pattern.abstractFactory;

public interface AbstractFactory {
	Shape getShape(String shapeType);
	Color getColor(String colorType);
}
