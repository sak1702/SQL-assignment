package com.sonata.practical;


public class Staff extends Employee{
String title;
	
	@Override
	 double salcal() throws MyException{
		double hra=0.18*BasePay;
		if (BasePay+hra < 5000)
			throw new MyException("The Total Salary Should be greater than 5000");
		else return BasePay+hra;
	}
	
	Staff(){};
	public Staff(int eId, String eName, Address obj, double basePay, String title) {
		super(eId, eName, obj, basePay);
		this.title = title;
	}



	@Override
	public String toString()  {
		return "Staff [title=" + title + ", eId=" + eId + ", eName=" + eName + ", obj=" + obj + ", BasePay=" + BasePay
				+ "]";
	}

}
