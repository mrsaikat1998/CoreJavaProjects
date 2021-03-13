package com.nt.cursorobjects;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class EnuTest2 {

	public static void main(String[] args) {
		// create Hashtable Object
		Hashtable<Object, Object> ht = new Hashtable<>();
		// add element into Hashtable
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(5, "E");

																									// Retrieve object
		// by using Enumerations
		Enumeration enu = ht.elements();
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		System.out.println();
		System.out.println();

		// by using Iterator
		Iterator<Map.Entry<Object, Object>> itr = ht.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Object, Object> m = itr.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println();
		
		// by using for-each loop
		for (Map.Entry<Object, Object> m : ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
