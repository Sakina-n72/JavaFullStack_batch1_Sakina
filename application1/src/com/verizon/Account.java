package com.verizon;

public class Account {
	int accNumber;
	String name;
	double balance;
	Account(){  //custom constructor with zero parameter
		accNumber=999;
		name="Banker";
		balance=00000;
	}
	
	Account(int accNumber, String name, double balance){
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}
	
	Account(int accNumber, String name){
		this.accNumber = accNumber;
		this.name = name;
		//this.balance = balance;
	}
	
	Account(int accNumber, double balance){
		this.accNumber = accNumber;
		//this.name = name;
		this.balance = balance;
	}
	

	void deposit(int amt) {
		balance+=amt;
	}
	
	double withdraw(int amt ) {
		balance-=amt;
		return balance;
	}
	double getbalance() {
		return balance;
	}
	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
/*
	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", name=" + name + ", balance=" + balance + "]";
	}*/

}
