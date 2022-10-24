package com.app.fruits;

public class Orange extends Fruits {

	public Orange(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String taste() {
		return "Sour";
		
	}
	public void juice() {
		System.out.println("Name : "+super.getName()+" Weight : "+super.getWeight()+" extracting Juice! ");
	}
}
