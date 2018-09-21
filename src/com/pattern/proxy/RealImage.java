package com.pattern.proxy;

public class RealImage implements Image {
	private String fileName;
	public RealImage(String fileName) {
		this.fileName=fileName;
		loadImage();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(fileName+ " is display");
	}
	
	private void loadImage() {
		System.out.println(fileName + " is loading");
	}

}
