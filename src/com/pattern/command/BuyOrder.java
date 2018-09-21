package com.pattern.command;

public class BuyOrder implements Order {
	private Stock stock;
	
	public BuyOrder(Stock stock) {
		this.stock=stock;
	}
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		stock.buy();
	}

}
