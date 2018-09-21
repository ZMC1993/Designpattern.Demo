package com.pattern.compositeEntity;

public class Client {
	private CompositeEntity compositeEntity=new CompositeEntity();
	
	public void setData(String data1,String data2) {
		compositeEntity.setData(data1, data2);
	}
	
	public void printData() {
		for(String data: this.compositeEntity.getData()) {
			System.out.println("data:"+data);
		}
	}
}
