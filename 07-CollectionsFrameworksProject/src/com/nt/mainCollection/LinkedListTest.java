package com.nt.mainCollection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		/*
		ADDING :
			1. add(Object o) / offer(Object o) / push(Object o)
			2. addAll(Object o)
			3. addFirst(Object o) / offerFirst(Object o)
			4. addLast(Object o) / offerLast(Object o)
		 	*/
		
		LinkedList<Object> l=new LinkedList<>();
		l.add("A");
		l.offer("B");
		l.offer("C");
		System.out.println(l);
		l.addFirst("1");
		l.addLast(4);
		System.out.println(l);
		l.offerFirst(0);
		l.offerLast(null);
		System.out.println(l);
		
		/*
		SEARCHING:
			1. contains(Object o)
			2. containAll(Collection c)
			3. indexOf(Object o)
			4. lastIndexOf(Object o)
			*/
		
		//[0, 1, A, B, C, 4, null]
		
		
		
		/*
		GETTING ELEMENT:
			1. get()
			2. getFirst() / peak() / peakFirst()
			3. getLast() / peakLast()
			*/
		
		/*
		REMOVE:
			1. remove(Object o)
			2. remove(int index)
			3. remove() / removeFirst() / pool() / pollFirst() / pop()
			4. removeLast() / pollLast()
			5. removeFirstOccurence(Object)
			6. removeLastOccurence(Object)
		*/
		l.pop();
		System.out.println(l);
		/*
		INSERTING OBJECT:
			1. add(int index,Object o)
			2. addIndex(int index, Collection c)
			*/
	
		/*	
			REPLACING:
				1. set(int index,Object o)
			*/
		
	}

}
