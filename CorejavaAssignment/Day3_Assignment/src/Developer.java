package com.sonataAssignment;

public class Developer extends Emp{

	Developer(int a,String b){
		//constructor with 2 parameters 
		this.eid=a;
		this.ename=b;
	}
	public double salCal(int a) {
		this.esal=a*1.5;
		return this.esal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer e1= new Developer(102,"Shankar");
		e1.salCal(15000);
		e1.display();
	}

}
