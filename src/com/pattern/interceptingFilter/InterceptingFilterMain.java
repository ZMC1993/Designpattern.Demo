package com.pattern.interceptingFilter;

public class InterceptingFilterMain {
	public static void main(String[] args) {
		FilterManager fm=new FilterManager(new Target());
		fm.setFilter(new DebugFilter());
		fm.setFilter(new AuthenticationFilter());
		
		Client c=new Client(fm);
		c.sendRequest("home");
	}
}
