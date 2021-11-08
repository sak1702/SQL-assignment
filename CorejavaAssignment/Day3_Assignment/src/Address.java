package com.sonata.practical;

public class Address {
	private String City;
	private  int DoorNo;
	private int PinNo;
	private String Street;
	
	Address(){};
	public Address(String city, int doorNo, int pinNo, String street) {
		super();
		City = city;
		DoorNo = doorNo;
		PinNo = pinNo;
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String City) {
		this.City = City;
	}
	public int getDoorNo() {
		return DoorNo;
	}
	public void setDoorNo(int DoorNo) {
		this.DoorNo = DoorNo;
	}
	public int getPinNo() {
		return PinNo;
	}
	public void setPinNo(int PinNo) {
		this.PinNo = PinNo;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String Street) {
		this.Street = Street;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", DoorNo=" + DoorNo + ", PinNo=" + PinNo + ", Street=" + Street + "]";
	}

}
