package com.verizon;

public class Employee extends Person {
	String desg;
	Employee(){
		System.out.println("Child...........");
	}
	Employee(String desg){
		this();
		this.desg=desg;
		System.out.println(this.desg);
	}
	public static void main(String[] args) {
		Employee el = new Employee("FSD");
	}
}
