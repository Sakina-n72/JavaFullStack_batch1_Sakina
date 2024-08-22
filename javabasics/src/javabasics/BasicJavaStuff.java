package javabasics;

public class BasicJavaStuff {

	public static void main(String[] args) {
		
//		System.out.println("hello world");
		Bottle waterBottle = new Bottle();
		waterBottle.fill();
		waterBottle.reFill();
		waterBottle.colour = "blue";
		
		
	}

}

class Bottle{
	String capacity, colour, material;
	void fill() {
		System.out.println("Fill the bottle");
	}
	void reFill() {
		System.out.println("Refill the bottle!");
	}
	
}
