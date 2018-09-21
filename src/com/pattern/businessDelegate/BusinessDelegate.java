package com.pattern.businessDelegate;

public class BusinessDelegate {
	//private BusinessService businessService;
	private BusinessLookUp businessLookUp;
	private String serviceType;
	
	public BusinessDelegate() {
		this.businessLookUp=new BusinessLookUp();
	}
	
	public void setServiceType(String serviceType) {
		this.serviceType=serviceType;
	}
	
	public void doTask() {
		businessLookUp.getBusinessService(serviceType).doProcessing();
	}
}
