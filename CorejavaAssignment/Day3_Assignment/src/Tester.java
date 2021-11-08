package com.sonataAssignment;

public class Tester extends Emp {

	Tester(int a,String b){
		//constructor with 2 parameters 
		this.eid=a;
		this.ename=b;
	}
	public double salCal(int a) {
		this.esal=a*1.20;
		return this.esal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester e1= new Tester(104,"Nikhil");
		e1.salCal(30000);
		e1.display();
	}

}
