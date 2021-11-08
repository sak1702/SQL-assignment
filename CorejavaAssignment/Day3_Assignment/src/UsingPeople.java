package com.sonata.practical;

public class UsingPeople {
	public static void main (String args[]) throws MyException {
		
		Address a=new Address();
		a.setCity("banglore");
		a.setDoorNo(10);
		a.setPinNo(562114);
		a.setStreet("st1");
		
		Staff s= new Staff();
		s.BasePay=7000;
		s.eId=1;
		s.eName="laxman";
		s.obj=a;
		s.title="Admin";
		System.out.println(s.toString());
		System.out.println("Total Salary-Staff: "+s.salcal());

		TechnicalEmp t= new TechnicalEmp();
		t.BasePay=1001;
		t.eId=2;
		t.eName="kiran";
		t.obj=a;
		t.skills="Java";
		System.out.println(t.toString());		
		System.out.println("Total Salary-Tech emp: "+t.salcal());
	}
}
