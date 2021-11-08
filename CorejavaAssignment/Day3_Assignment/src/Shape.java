package com.sonataAssignment;

public class Shape {

		int a;
		
		public int area(int l) {
			this.a=l;
			return a;
		}
		public void dis() {
			System.out.println("Area of the Shape is "+this.a+"units");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Shape s=new Shape();
			s.area(10);
			s.dis();
		}

	}

