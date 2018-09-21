package com.pattern.bridge;

public class BlueDraw implements DrawAPI {

	@Override
	public void draw(int radus, int x, int y) {
		// TODO Auto-generated method stub
		System.out.printf("draw blue circle in %d ,%d by radus is %d %n",x,y,radus);
	}

}
