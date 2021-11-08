package com.sonataAssignment;

public class Emp {
	int eid;
	String ename;
	double esal;
	
	Emp(){}//empty constructor
	
	Emp(int a,String b){
		//constructor with 2 parameters 
		this.eid=a;
		this.ename=b;
	}
			
	public double salCal(int a) {
		this.esal=a;
		return this.esal;
	}
	
	public void display() {
		System.out.println("Emp Id : "+eid);
		System.out.println("Emp Name : "+ename);
		System.out.println("Emp Sal : "+esal);	
		System.out.println();
	}
	public static void main(String[] args) {
		
		Emp e1= new Emp(101,"Sharath");
		e1.salCal(12000);
		e1.display();
		
	}
}

