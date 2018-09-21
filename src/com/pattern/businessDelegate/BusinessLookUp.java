package com.pattern.businessDelegate;

public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceType) {
		return serviceType.equals("EJB")?new EJBService():new JMSService();
	}
}
