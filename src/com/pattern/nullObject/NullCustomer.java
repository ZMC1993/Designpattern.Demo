package com.pattern.nullObject;

public class NullCustomer extends AbstractCustomer {
	public NullCustomer() {
		this.name="This customer is null";
	}
	
	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
