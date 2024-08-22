package javabasics;

public class JavaBeansDemo {

	public static void main(String[] args) {
		Laptop firstLaptop = new Laptop("lenovo",101);
		System.out.println(firstLaptop);
		Laptop secondLaptop = new Laptop(null, 0)
	}

}
class Laptop{
	private String brandName;
	public Laptop(String brandName, int modelNumber) {
		this.brandName = brandName;
		this.modelNumber = modelNumber;
	}
	private int modelNumber;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + ", modelNumber=" + modelNumber + "]";
	}

	
}
