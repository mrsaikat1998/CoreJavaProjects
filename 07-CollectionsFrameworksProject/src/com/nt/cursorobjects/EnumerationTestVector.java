package com.nt.cursorobjects;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTestVector {

	public static void main(String[] args) {
		//Create Vector class Object
				Vector<String> v =new Vector<>();
				//add elements into The Vector
				v.add("WB");
				v.add("UP");
				v.add("MP");
				v.add("DP");
				v.add("KP");
				//Create Enumeration Object by calling elements method
				Enumeration enu=v.elements();
				//iterate value from vector by using loop
				while(enu.hasMoreElements()){
					String values=(String)enu.nextElement();
					System.out.print(values+" ");
				}

	}

}
