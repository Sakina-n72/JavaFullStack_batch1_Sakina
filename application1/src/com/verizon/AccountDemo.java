package com.verizon;
import java.util.Scanner;
public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.accNumber=102;
		account.name="Lucky";
		account.balance=1234;
		System.out.println(account);
		System.out.println(account.accNumber +" "+ account.name +" "+ account.balance);
		
		Account account1 = new Account(101, "Venkatesh", 900);
		System.out.println(account1);
		System.out.println(account1.accNumber +" "+ account1.name +" "+ account1.balance);
		
		Account account2 = new Account();
		System.out.println(account2);
		System.out.println(account2.accNumber +" "+ account2.name +" "+ account2.balance);
		
		Account account3 = new Account();
		Scanner s = new Scanner(System.in);
		account3.accNumber = s.nextInt();
		account3.name = s.next() ;
		account3.balance = s.nextDouble();
		System.out.println(account3);
		System.out.println(account3.accNumber +" "+ account3.name +" "+ account3.balance);

		Account account4 = new Account(104, "Harikha" );
		System.out.println(account4);
		System.out.println(account4.accNumber +" "+ account4.name);
		
		Account account6 = new Account();
		account6.setAccNumber(106);
		account6.setName("mouni");
		account6.setBalance(7000);
		System.out.println(account6);
	}

}
