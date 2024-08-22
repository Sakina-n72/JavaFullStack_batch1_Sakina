package com.verizon.mavenDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component 
public class IndianCricketer implements Cricketer{
	@Autowired
	private Address address;
	@Autowired
	private Details details;

	

//	@Autowired
//	private String name;
//	@Autowired
//	private int jerseyNumber;
	
//	public IndianCricketer() {
//		
//	}
//
//	public String toString() {
//		return "IndianCricketer [name=" + name + ", jerseyNumber=" + jerseyNumber + "]";
//	}
//	public IndianCricketer(String name, int jerseyNumber) {
//		super();
//		this.name = name;
//		this.jerseyNumber = jerseyNumber;
//	}
//	public String getName() {
//		return name;
//	}
//	@Autowired
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getJerseyNumber() {
//		return jerseyNumber;
//	}
//	@Autowired
//	public void setJerseyNumber(int jerseyNumber) {
//		this.jerseyNumber = jerseyNumber;
//	}
	@Override
	public void play() {
		System.out.println("Hi I am an annotations cricketer and below are my address details");
		System.out.println(address);
		System.out.println(details);
//		System.out.println("Hello, my name is "+details.getName()+" and my jersey number is "+details.getJerseyNumber());
	}
	

}
