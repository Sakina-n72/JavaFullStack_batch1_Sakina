package javabasics;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		new New() {

			@Override
			public void size() {
				System.out.println("hello");
				
			}
		}.size();
		New n  = () -> System.out.println("hello");
		MyBottle obj = new MyBottle();
		obj.size(new New() {

			@Override
			public void size() {
				System.out.println("small");
			}
			
		});

	}

}
class MyBottle{
	void size(New b) {
		b.size();
	}
}
interface New {
	 void size();
	}
