package com.pattern.command;

public class SellOrder implements Order {
	private Stock stock;
	
	public SellOrder(Stock stock){
		this.stock=stock;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		stock.sell();
	}

}
