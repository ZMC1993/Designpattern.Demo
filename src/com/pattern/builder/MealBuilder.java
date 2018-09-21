package com.pattern.builder;

public class MealBuilder {
	public static Meal prepareMeal1() {
		Meal m=new Meal();
		m.addItem(new ChikenBurger());
		m.addItem(new Pepsi());
		return m;
	}
	public static Meal prepareMeal2() {
		Meal m=new Meal();
		m.addItem(new VegBurger());
		m.addItem(new Pepsi());
		return m;
	}
	public static Meal prepareMeal3() {
		Meal m=new Meal();
		m.addItem(new ChikenBurger());
		m.addItem(new Coke());
		return m;
	}
	public static Meal prepareMeal4() {
		Meal m=new Meal();
		m.addItem(new VegBurger());
		m.addItem(new Coke());
		return m;
	}
}
