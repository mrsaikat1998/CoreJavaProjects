package com.nt.iteratingobject;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class EnumeratonExample {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Saikat");
		v.add("Siva");
		v.add("Suraj");
		v.add("Addi");
		v.add("Vishwa");

		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		System.out.println();
		for (Enumeration iterator = v.elements(); iterator.hasMoreElements();) {
			String string = (String) iterator.nextElement();
			System.out.println(string);
		}
		System.out.println();
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("Saikat", 1);
		ht.put("Ram", 2);
		ht.put("Shyam", 3);
		ht.put("Durga", 4);
		ht.put("Soumen", 5);
		ht.put("Shivam", 6);
		Enumeration enu1=ht.elements();
		while(enu1.hasMoreElements()) {
			System.out.println(enu1.nextElement());
		}
		for(Enumeration enu2=ht.elements();enu2.hasMoreElements();) {
			int i=(Integer)enu2.nextElement();
			System.out.println(i);
		}
	}

}
