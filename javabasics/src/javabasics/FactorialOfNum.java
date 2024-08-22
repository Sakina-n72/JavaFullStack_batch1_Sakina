package javabasics;

public class FactorialOfNum {

	public static void main(String[] args) {
		int num = 3;
		int factorial = 1;
		while(num>0)
		{
			factorial = factorial * num;
			num--;
		}
		System.out.println(factorial);

	}

}
