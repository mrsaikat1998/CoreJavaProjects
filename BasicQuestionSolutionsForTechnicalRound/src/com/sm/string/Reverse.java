//Reverse.java
//Reverse a String
package com.sm.string;
public class Reverse {

	public static void main(String[] args) {
		String s1 = "Saikat";// (s1.length)-1=5
		//System.out.println(s1.charAt(5));
		String reverse = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			reverse = reverse + s1.charAt(i);// 5
		}
		System.out.println("Your Reverse String is ::" + reverse);
	}

}
