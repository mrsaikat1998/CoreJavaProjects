package com.nt.sm.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// creating Vector class Object
		Vector<Object> v = new Vector<>();
		
		// initial capacity
		System.out.println("Capasity : " + v.capacity());

		// count for check how manay object present
		System.out.println("Size : " + v.size());

		// printing the element
		System.out.println("Elements : " + v);
		System.out.println();

		// add objects in Vector Collection
		v.add("a");
		v.add("b");
		v.add(5);
		v.add(6.7);
		v.add(5.2f);
		v.add('b');
		v.add("a");
		v.add(null);
		v.add(new Example(4, 5));
		v.add("a");
		v.add("b");
		v.add(5);
		v.add(6.7);
		v.add(5.2f);
		v.add('b');
		v.add("a");
		v.add(null);
		v.add(new Example(4, 5));

		System.out.println("Capasity : " + v.capacity());

		// count for check how many object present
		System.out.println("Size : " + v.size());

		// printing the element
		System.out.println("Elements : " + v);

	}

}
