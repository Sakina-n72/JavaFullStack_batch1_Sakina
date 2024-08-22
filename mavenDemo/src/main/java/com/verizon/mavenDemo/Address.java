package com.verizon.mavenDemo;

public class Address {
	
	private String city;
	private Integer pinCode;
	public String getCity() {
		return city;
	}
	public Address() {
		
	}
	public Address(String city, Integer pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	public void setCity(String city) {
		this.city = city;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	
	

}
