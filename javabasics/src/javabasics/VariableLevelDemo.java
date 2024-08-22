package javabasics;

import java.util.Scanner;

public class VariableLevelDemo {

	public static void main(String[] args) {
		addition.takeInput();
	}

}

class addition {
	static int firstValue, secondValue, result;

	static void takeInput() {
		System.out.println("Enter two numbers : ");
		Scanner numbers = new Scanner(System.in);
		firstValue = numbers.nextInt();
		secondValue = numbers.nextInt();
		add();
	}

	static void add() {
		result = firstValue + secondValue;
		print();
	}

	static void print() {
		System.out.println("The result is : " + result);
	}

}
