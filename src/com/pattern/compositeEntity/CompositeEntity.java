package com.pattern.compositeEntity;

public class CompositeEntity {
	private CoarseGrainedObject c=new CoarseGrainedObject();
	
	public void setData(String data1,String data2) {
		c.setData(data1, data2);
	}
	
	public String[] getData() {
		return c.getData();
	}
}
