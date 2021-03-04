package com.sm.flowcontrols;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		//create Scanner class reference for user inputs
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Valid Integer Numbers  ::");
		//read and store user inputs from user
		int number=scanner.nextInt();
		int factorial=1;
		for(int i=number;i>0;i--) {
			//calculating factorial values
			factorial=factorial*i;
		}
		//print outputs in console
		System.out.println("Factorial of "+number+" is = "+factorial+" .");

	}

}
