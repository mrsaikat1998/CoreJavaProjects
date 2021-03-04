package com.nt.cursorobjects;

import java.util.Enumeration;
import java.util.Hashtable;

public class EnumerationsTestHashtable {

	public static void main(String[] args) {
		//create Hashtable object
		Hashtable<Integer,String> hashTable=new Hashtable<>();
		hashTable.put(1, "WB");
		hashTable.put(2, "UP");
		hashTable.put(3, "MP");
		hashTable.put(4, "KP");
		hashTable.put(5, "DP");
		
		//create Enumeration Object by calling elements()
		Enumeration enu=hashTable.elements();
		//iterate elements from Hashtable
		while(enu.hasMoreElements()) {
			String values=(String)enu.nextElement();
			System.out.print(values+" ");
		}

	}

}
