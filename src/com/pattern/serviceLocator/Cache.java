package com.pattern.serviceLocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private List<Service> services;
	
	public Cache() {
		this.services=new ArrayList<Service>();
	}
	
	public Service getService(String name) {
		for(Service s: services) {
			if(s.getName().equalsIgnoreCase(name)) {
				System.out.println("Returning cached "+name+" object");
				return s;
			}
		}
		return null;
	}
	
	public void addService(Service newService) {
		boolean exist=false;
		for(Service s: services) {
			if(s.getName().equalsIgnoreCase(newService.getName())) {
				exist=true;
			}
		}
		if(!exist) {
			services.add(newService);
		}
	}
}
