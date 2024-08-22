package com.verizon;
//inheit from Account (accNumber, name, balance)
public class SavingsAccount extends Account {
	String proof;
	String bankNmae;
	
	void show() {
		deposit(1000);
		System.out.println(getbalance());
		System.out.println(accNumber +" "+ balance);
		
	}
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.show();
		sa.getbalance();
		
	}
}
