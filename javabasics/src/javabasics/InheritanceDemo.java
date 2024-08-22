package javabasics;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		WaterBottle blue = new WaterBottle();
		blue.fill();
	}

}

class NewBottle {
	void fill() {
		System.out.println("it's filling...");
	}
}

class WaterBottle extends NewBottle{
	@Override
	void fill() {
		System.out.println("water is being filled...");
	}
}