package com.nt.arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		//in every collection we perform 9 operation  
		//adding, counting, printing, searching, retrieving, removing, inserting, replacing, sorting
		/* Adding Operations*/
		al.add(1);
		al.add("Saikat");
		al.add('a');
		al.add(2.5);
		al.add(1);
		al.add("Mondal");
		al.add('B');
		al.add(10.5);
		al.add(100);
		al.add("Saikat");
		al.add('a');
		al.add(2.5);
		//Retriving by for loop
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		//for-each Loop
		for(Object e: al) {
			System.out.println(e);
		}

	}

}
