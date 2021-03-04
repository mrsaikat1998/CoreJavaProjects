package com.nt.sm.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//create ArrayList object
		ArrayList<Object> al=new ArrayList<>();
		
		//counting element
		System.out.println("Size :"+al.size());
		System.out.println("Elements : "+al);
		
		//from 1.2al there is no capacity() but ArrayList initial capacity is 10 and increment by half.
		//if initial value 0 or 1 then direct increase by 2.
		//Array list has 3 constructor 1. 0-arg cons, 2. (Collection <? extends e> c) 3.(Initial capacity)
		
		//adding element in collection
		al.add("a");
		al.add("b");
		al.add(5);
		al.add(6.7);
		al.add(5.2f);
		al.add('b');
		al.add("a");
		al.add(null);
		al.add(new Example(4, 5));
		al.add("a");
		al.add("b");
		al.add(5);
		al.add(6.7);
		al.add(5.2f);
		al.add('b');
		al.add("a");
		al.add(null);
		al.add(new Example(4, 5));
		
		//counting operations
		System.out.println("Size :"+al.size());
		//printing operations
		System.out.println("Elements : "+al);
		//System.out.println(al.get(0));
		System.out.println();
		
		//Retrieving operations
		for(Object obj:al) {
			if(obj instanceof String) {
				System.out.println(((String) obj).toUpperCase());
			}
			else {
				System.out.println(obj);
			}
		}
		
		//searching operations
		//contains method internally call equals method
		System.out.println();
		System.out.println(al.contains("a"));
		

	}

}
