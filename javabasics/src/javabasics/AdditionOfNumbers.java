package javabasics;

public class AdditionOfNumbers {

	public static void main(String[] args) {
		int result = 0;
		for(int i=1; i<=100;i++) {
			result += i;
		}
		System.out.println("The sum of first 100 numbers are : "+result);
	}
}
