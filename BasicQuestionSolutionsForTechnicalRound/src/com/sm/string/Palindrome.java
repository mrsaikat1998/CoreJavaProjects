package com.sm.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = null;
		String string = null, reverse = "";

		// take String values from end user
		sc = new Scanner(System.in);
		System.out.println("Enter String value to check palindrome");
		string = sc.nextLine();
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		if (string.equals(reverse)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
