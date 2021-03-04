package com.nt.cursorobjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTestCollection {

	public static void main(String[] args) {
		//create ArrayList Object
		List<String> list=new ArrayList<>();
		//add elements into list
		list.add("WB");
		list.add("UP");
		list.add("MP");
		list.add("KP");
		list.add("DP");
		//create Iterate Object by calling iterate() method
		Iterator itr=list.iterator();
		//iterate value from list
		while(itr.hasNext()) {
			String element=(String)itr.next();
			System.out.print(element+" ");
		}
	}

}
