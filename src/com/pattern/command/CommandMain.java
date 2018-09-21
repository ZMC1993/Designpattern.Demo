package com.pattern.command;

public class CommandMain {
	public static void main(String[] args) {
		Stock s=new Stock("stock1",10);
		Broker b=new Broker();
		b.add(new BuyOrder(s));
		b.add(new BuyOrder(s));
		b.add(new BuyOrder(s));
		b.add(new BuyOrder(s));
		b.add(new SellOrder(s));
		b.excuet();
		
	}
}
