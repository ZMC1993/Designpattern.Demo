package com.pattern.prototype;

public class PrototypeMain {
	public static void main(String[] args) {
		ShapeCache sc=new ShapeCache();
		
		sc.getShape("Circle").draw();
		sc.getShape("Rectangle").draw();
		sc.getShape("Square").draw();
		sc.getShape("Circle").draw();
		sc.getShape("Circle").draw();
		
	}
}
