package com.app.fruits;


public class Apple extends Fruits {

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
		}
	@Override
	public String taste() {
		return "Sweet and Sour";
		
	}
	public void jam() {
		System.out.println("Name : "+super.getName()+" Making Jam ! ");
	}
  
}
