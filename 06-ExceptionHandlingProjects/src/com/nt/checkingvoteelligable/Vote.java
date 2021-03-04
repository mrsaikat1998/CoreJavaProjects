package com.nt.checkingvoteelligable;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) throws UnderAgeException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=scan.nextInt();
		if(age<18)
			throw new UnderAgeException();
		else
			System.out.println("You are Elegable for votting");

	}

}
