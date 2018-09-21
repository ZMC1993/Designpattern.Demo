package com.pattern.bridge;

public class Circle extends Shape {

	private int radus;
	private int x;
	private int y;
	
	
	public Circle(int radus, int x, int y,DrawAPI drawAPI) {
		super(drawAPI);
		this.x=x;
		this.y=y;
		this.radus=radus;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		super.drawAPI.draw(radus, x, y);
	}

}
