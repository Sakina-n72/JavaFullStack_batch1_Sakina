package com.verizon;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex5 {
	// F = null;
	public void show() throws FileNotFoundException, InterruptedException  {
		FileReader f = new FileReader("c:\\xyz.txt");
		Thread.sleep(10);
	}
	public static void main(String[] args) throws FileNotFoundException, InterruptedException  {
		Ex5 e1 = new Ex5();
		e1.show();
		System.out.println("ok");
	}
	
}
