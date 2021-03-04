package com.nt.cursorobjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// add elements into list
		list.add("WB");
		list.add("UP");
		list.add("MP");
		list.add("KP");
		list.add("DP");
		// create ListIterate Object by calling listIterate() method
		ListIterator itr = list.listIterator();
		// iterate the elements
		while (itr.hasNext()) {
			String elements = (String) itr.next();
			System.out.print(elements + " ");
			if (elements.equalsIgnoreCase("dp")) {
				itr.set("K9");//replace DP with K9
				itr.add("OD");//add new Elements
			}
		}
		System.out.println();
		System.out.println(list);
	}

}
