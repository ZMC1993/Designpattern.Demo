package com.pattern.bridge;

public class RedDraw implements DrawAPI {

	@Override
	public void draw(int radus,int x, int y) {
		// TODO Auto-generated method stub
		System.out.printf("draw red circle in %d ,%d by radus is %d %n",x,y,radus);
	}

}
