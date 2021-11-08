package com.sonata.practical;

public class TechnicalEmp extends Employee{
String skills;
	
	@Override
	 double salcal() throws MyException{
		double hra=0.12*BasePay;
		if (BasePay+hra < 5000)
			throw new MyException("The Total Salary Should be greater than 5000");
		else return BasePay+hra;
	}
	
	TechnicalEmp(){};
	public TechnicalEmp(int eId, String eName, Address obj, double basePay, String skills) {
		super(eId, eName, obj, basePay);
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "TechnicalEmp [skills=" + skills + ", eId=" + eId + ", eName=" + eName + ", obj=" + obj + ", BasePay="
				+ BasePay + "]";
	}
	

}
