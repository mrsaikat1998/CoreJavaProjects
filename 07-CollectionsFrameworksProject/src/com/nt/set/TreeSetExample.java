package com.nt.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//create Set object
		NavigableSet<Integer> ts=new TreeSet<>();
		//adding value into TreeSet
		for(int i=10;i<=20;i++) {
			ts.add(i);
		}
		//print the treeset
		System.out.println(ts);
		//System.out.println(ts.ceiling(5));
		//System.out.println(ts.floor(15));
		//System.out.println(ts.floor(5));
		//System.out.println(ts.floor(21));
		//System.out.println(ts.higher(15));
		//System.out.println(ts.higher(8));
		System.out.println(ts.lower(55));
	}

}
