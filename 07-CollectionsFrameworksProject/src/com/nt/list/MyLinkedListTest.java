package com.nt.list;

import java.util.LinkedList;

public class MyLinkedListTest {

	public static void main(String[] args) {
		//first LinkedList
		LinkedList<Object> linkedList1=new LinkedList<>();
		linkedList1.add(5);
		linkedList1.add("India");
		linkedList1.add('a');
		linkedList1.add(6.7);
		System.out.println(linkedList1);
		//Second LinkedList
		LinkedList<Object> linkedList2=new LinkedList<>();
		linkedList2.add(100);
		linkedList2.add("Something");
		linkedList2.add('x');
		linkedList2.add(56.4);
		linkedList2.add(10);
		linkedList2.add(true);
		linkedList2.add(null);
		linkedList2.add("java");
		System.out.println(linkedList2);
		//linkedList1 join linkedList2
		linkedList2.addAll(linkedList1);
		System.out.println(linkedList2);

	}

}
