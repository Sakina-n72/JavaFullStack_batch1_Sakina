package com.verizon;

public class Ex6 {
	public static void main(String[] args) throws DepositException {
		int amt = 999;
		if(amt<1000)
			throw new DepositException("minimum deposition is 1000");
		else
			System.out.println("thanks");
			
	}
}
