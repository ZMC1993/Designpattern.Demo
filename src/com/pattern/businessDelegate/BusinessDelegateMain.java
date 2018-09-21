package com.pattern.businessDelegate;

public class BusinessDelegateMain {
	public static void main(String[] args) {
		BusinessDelegate b=new BusinessDelegate();
		b.setServiceType("EJB");
		Client c=new Client(b);
		c.doTask();
		b.setServiceType("JMS");
		c.doTask();
	}
}
