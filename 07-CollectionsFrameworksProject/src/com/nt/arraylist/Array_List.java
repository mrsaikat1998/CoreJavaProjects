package com.nt.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List {

	public static void main(String[] args) {
		//Create ArrayList Object by 0parm cons
		ArrayList<Object> al=new ArrayList<>();
		//add elements into ArrayList
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("A");
		//counting how many object are present into collection
		System.out.println("Size : "+al.size());
		//printing elements
		System.out.println("Elements are : "+al);
		//searching elements
		System.out.println("Contains or Not : "+al.contains("A"));
		//if contains then which location from starting
		System.out.println("Which Location from starting : "+al.indexOf("A"));
		//if contains then which location from end.
		System.out.println("Location from last : "+al.lastIndexOf("A"));
		//Getting single object
		System.out.println("Elements in Index4 : "+al.get(4));
		//getting object within range
		System.out.println("Elements from 0 to 4 index : "+al.subList(0, 4));
		/** Iterating Object from Collection **/
		//using for loop and get(-) method combination
		System.out.print("Elements are/for loop : ");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		//using for-each loop
		System.out.print("Elements are/for-Each loop : ");
		for(Object o:al) {
			System.out.print(o+" ");
		}
		System.out.println();
		//by using Iterator and while loop
		//create iterator object
		Iterator iterator=al.iterator();
		System.out.print("Elements are/Iterator : ");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		//using ListIterator and for loop
		System.out.print("Elements are/ListIterator : ");
		for(ListIterator listIterator=al.listIterator();listIterator.hasNext();) {
			System.out.print(listIterator.next()+" ");
		}
		System.out.println();
	}

}
