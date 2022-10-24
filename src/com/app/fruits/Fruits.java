package com.app.fruits;

public class Fruits {
//instance variables
private String color;
private double weight;
private String name;
private boolean fresh;

//constructor
public Fruits(String color,double weight,String name){
	super();
	this.color=color;
	this.weight=weight;
	this.name=name;
	this.fresh=true;
	
}
public String toString(){
	return "Name="+name+"Color="+color+"Weight="+weight;
	}
public String taste(){
	return "No Specific Taste";
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isFresh() {
	return fresh;
}
public void setFresh(boolean fresh) {
	this.fresh = fresh;
}




}
