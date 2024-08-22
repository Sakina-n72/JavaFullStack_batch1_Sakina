package com.verizon;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int x[] = { 1, 2 };
		
			try {
				int c = a / b;
				System.out.println(c);
			} 
			catch (ArrayIndexOutOfBoundsException ae | ArthmeticException xe) {
				System.out.println(x[4]);
			}

			
		FileReader f=null;
		try {
			f = new FileReader("c:\\xyz.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				f.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
