package com.sonataAssignment;

public class Rectangle extends Shape{

	public int area(int l,int b) {
		this.a=l*b;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.area(10,20);
		r.dis();
	}

}