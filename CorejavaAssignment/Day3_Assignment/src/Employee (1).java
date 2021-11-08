package com.sonata.practical;

public abstract class Employee {
	int eId;
	String eName;
	Address obj;
	double BasePay;
	abstract double salcal() throws MyException;
	
	Employee(){};
	public Employee(int eId, String eName, Address obj, double basePay) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.obj = obj;
		BasePay = basePay;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", obj=" + obj + ", BasePay=" + BasePay + "]";
	}

}
