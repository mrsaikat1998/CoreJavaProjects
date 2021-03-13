package com.nt.arraylist;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add("A");
		al.add(100);
		al.add(25.5);
		al.add(true);
		al.add(null);
		al.add('A');
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		ArrayList<Object> al1=new ArrayList<>();
		System.out.println(al1);
		al1.add(false);
		al1.add(100);
		al.addAll(al);
		System.out.println(al1);
		System.out.println(al1.size());

	}

}
