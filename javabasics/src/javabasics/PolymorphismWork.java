package javabasics;
import newpackage.VisibilityDemo;

public class PolymorphismWork {
	public static void main(String[] args) {
		add(1, 2, 3);
		
		VisibilityDemo obj = new VisibilityDemo();
		obj.num = 23;
		//obj.print();

	}

	static void add(int... values) {
		int total = 0;
		for (int value : values) {
			total += value;
		}
		System.out.println(total);

	}
}
