package com.tms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
	
		List l= new LinkedList();
		l.add(23);
		l.add("hi");
		l.add(LocalDate.now());
		l.add(1234.9876);
		l.add(23);
		l.add("hi");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains("hi"));
		System.out.println(l.remove("23"));
		System.out.println(l.indexOf("hi"));
		System.out.println(l.lastIndexOf("hi"));
		System.out.println(l.isEmpty());
		ArrayList a = new ArrayList();
		a.add(32);
		a.add(45);
		a.add(56);
		l.addAll(a);
//		l.remove(a.LocalDate.of())
		System.out.println(l);
		System.out.println("with foreach");
		for(Object obj : l)
			System.out.println(obj);
		System.out.println("with iterator");
		Iterator i = l.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("with forEach lambda");
		l.forEach(x -> System.out.println(x));
		
		
		
		
	}

}
