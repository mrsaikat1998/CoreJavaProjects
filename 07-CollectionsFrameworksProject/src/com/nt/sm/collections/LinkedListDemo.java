package com.nt.sm.collections;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListDemo {

	public static void main(String[] args) {
		//create LinkedList object
		LinkedList<Object> ll=new LinkedList<>();
		//link does not have any initill capacity
		//LinkedList have 2 constructor 1.no arg constructor
		//2. (Collection <? extends e>c) -> for coping one LinkedList to another LinkedList
		
		ll.add("a");
		ll.add("b");
		ll.add(5);
		ll.add(6.7);
		ll.add(5.2f);
		ll.add('b');
		ll.add("a");
		ll.add(null);
		ll.add(new Example(4, 5));
		ll.add("a");
		ll.add("b");
		
		
		System.out.println("Size : "+ll.size());
		System.out.println("Elements : "+ll);

	}

}
