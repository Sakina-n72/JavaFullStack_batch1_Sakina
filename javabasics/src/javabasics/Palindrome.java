package javabasics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String rev = "";
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = obj.nextLine();
		String[] arr = str.split("");
		//System.out.println(arr[0]);
		
		for(int i = arr.length -1 ; i >= 0; i--) {
		 
		rev += arr[i];	
		}
		if(str.equals(rev)){
			System.out.println("It is a palindrome!");
		}
		else {
			System.out.println("It is not!");
		}
	}

}
