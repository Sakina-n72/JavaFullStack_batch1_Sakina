package newpackage;

public class VisibilityDemo {
	public int num;
	protected void print() {
		System.out.println(num);
	}

	public static void main(String[] args) {
//		System.out.println(num);
		VisibilityDemo obj = new VisibilityDemo();
		obj.num = 1;
		obj.print();

	}

}
