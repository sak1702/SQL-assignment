package com.sonataAssignment3;

public class Staff extends Employee {

	String title;
	
	@Override
	 double salcal() {
		
		double hra=0.18*B_pay;
		return B_pay+hra;
		
	}
	
	@Override
	public String toString() {
		return "Staff [eid=" + e_id + ", ename=" + e_name +"]";
	}
	
	public static void main (String args[]) {
		Staff t= new Staff();
		Address a=new Address();
		a.setCity("banglore");
		a.setDoorno(10);
		a.setPin(562114);
		a.setStreet("st1");
		
		
		t.B_pay=1000;
		t.e_id=1;
		t.e_name="laxman";
		t.obj=a;
		System.out.println("eid : "+t.e_id);
		System.out.println("ename : "+t.e_name);
		System.out.println("Adress : "+t.obj);
		System.out.println("salary for tech emp:"+t.salcal());
	
	}
	
}
