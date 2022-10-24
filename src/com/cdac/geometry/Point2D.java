package com.cdac.geometry;

public class Point2D {
	private int x,y;
	public Point2D(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String show() {
		return "X="+x+" and "+"Y="+y;
	}
	public boolean isEqual(Point2D anotherPoint){
		return x==anotherPoint.x && y==anotherPoint.y;
	}
    public double calculateDistance(Point2D anotherPoint) {
    	double distance=((anotherPoint.x*anotherPoint.x)-(x*x))+((anotherPoint.y*anotherPoint.y)-(y*y));
    		return Math.sqrt(distance);
    }
}
