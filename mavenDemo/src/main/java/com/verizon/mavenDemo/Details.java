package com.verizon.mavenDemo;

public class Details {
	
	private String name;
	private int jerseyNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	@Override
	public String toString() {
		return "Details [name=" + name + ", jerseyNumber=" + jerseyNumber + "]";
	}
	
	

}
