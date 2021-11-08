package com.sonataAssignment3;

public class TechnicalEmp extends Employee {
	
	
	String skills;
	
	@Override
	 double salcal() {
		
		double hra=0.12*B_pay;
		return B_pay+hra;
		
	}
	
	@Override
	public String toString() {
		return "TechEmp [eid=" + e_id + ", ename=" + e_name +"]";
	}
	
	public static void main (String args[]) {
		Address a=new Address();
		a.setCity("banglore");
		a.setDoorno(10);
		a.setPin(562114);
		a.setStreet("st2");
		
		TechnicalEmp t= new TechnicalEmp();
		t.B_pay=1001;
		t.e_id=2;
		t.e_name="kiran";
		t.obj=a;
		System.out.println("eid : "+t.e_id);
		System.out.println("ename : "+t.e_name);
		System.out.println("Adress : "+t.obj);
		System.out.println("salary for tech emp:"+t.salcal());
	}

}
