package com.tms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
	public static void main(String[] args) {
		Set<Object> l = new HashSet<>();
		l.add(98);
		l.add(98);
		l.add(8);
		l.add(9);
		l.add(9856);
		l.add(34);
		l.add(6);
		l.add(8);
		l.add(9);
		
		Set<String> l1 = new TreeSet<>();
		l1.add("Soumya");
		l1.add("Venkatesh");
		l1.add("Prabha");
		
		Set<String> l2 = new LinkedHashSet<>();
		l2.add("Soumya");
		l2.add("Venkatesh");
		l2.add("Prabha");
		
		l.forEach(x -> System.out.println(x));
		l1.forEach(x -> System.out.println(x));
		System.out.println("user");
		l2.forEach(x -> System.out.println(x));
		Iterator i  = l2.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}

}
