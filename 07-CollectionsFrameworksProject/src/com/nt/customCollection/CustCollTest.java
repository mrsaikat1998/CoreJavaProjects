 package com.nt.customCollection;

public class CustCollTest {

	public static void main(String[] args) {
		NITcollection col=new NITcollection();
		
		col.add("a");
		col.add(10);
		col.add("Saikat");
		col.add(null);
		col.add('a');
		col.add("b");
		col.add(10);
		col.add("Mondal");
		col.add(5.6);
		col.add('a');
		col.add(true);
		
		System.out.println(col.contains("Saikat"));
		System.out.println(col.contains(null));
		
	}

}
