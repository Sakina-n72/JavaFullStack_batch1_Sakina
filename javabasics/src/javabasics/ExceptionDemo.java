package javabasics;

public class ExceptionDemo {

	public static void main(String[] args) {
		Loop num = new Loop();
		int[] arr = { 1, 2, 3 };
		num.printArray(4, arr);

	}

}

class Loop {
	void printArray(int number, int[] name) {
		try {
		for (int i = 2; i < number; i++) {
			System.out.println(name[i]);
		}
	}catch(ArrayIndexOutOfBoundsException err) {
		System.out.println("please enter a valid length of array");
		
	}}
}
//		}catch(IndexOutOfBound e) {
//			
//		}

// }
//}
