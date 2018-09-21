package com.pattern.builder;

public class BuilderMain {
	public static void main(String[] args) {
		Meal m1=MealBuilder.prepareMeal1();
		Meal m2=MealBuilder.prepareMeal2();
		Meal m3=MealBuilder.prepareMeal3();
		Meal m4=MealBuilder.prepareMeal4();
		
		System.out.printf("套餐价格为：%f%n",m1.getPrice());
		m1.show();
		System.out.printf("套餐价格为：%f%n",m2.getPrice());
		m2.show();
		System.out.printf("套餐价格为：%f%n",m3.getPrice());
		m3.show();
		System.out.printf("套餐价格为：%f%n",m4.getPrice());
		m4.show();
	}
}
