package com.verizon;

public class Person {
	int id;
	String name;

	Person() {
		System.out.println("Parent......");
	}

	public Person(int id, String name) {
		this.id=id;
		this.name=name;
		System.out.println("parametrised const" + this.id );
	}
}
