//Iterating Object by using Iterator
package com.nt.iteratingobject;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// Create ArrayList Object
		ArrayList<Integer> list = new ArrayList<>();
		// Adding object into Collections
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		Iterator ite = list.iterator();
		while (ite.hasNext()) {

			if ((Integer) ite.next() % 2 == 0) 
				ite.remove();
			
		}
		System.out.println(list);
	}
}
