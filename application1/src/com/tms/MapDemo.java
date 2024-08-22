package com.tms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(7, "html");

		m.put(1, "c");
		m.put(2, "cpp");
		m.put(3, "dsa");
		m.put(7, "html");
		m.put(4, "py");
		m.put(5, "dbms");
		m.put(6, "java");
		m.put(8, null);
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		Set ks = m.entrySet();
		Iterator i = ks.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
