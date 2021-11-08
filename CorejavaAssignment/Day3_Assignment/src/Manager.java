package com.sonataAssignment;

public class Manager extends Emp{
	
	Manager(int a,String b){
		//constructor with 2 parameters 
		this.eid=a;
		this.ename=b;
	}
	public double salCal(int a) {
		this.esal=a*1.16;
		return this.esal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager e1= new Manager(101,"Sharath");
		e1.salCal(24000);
		e1.display();
	}

}
