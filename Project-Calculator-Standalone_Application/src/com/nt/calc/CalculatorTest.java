package com.nt.calc;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//take input from user
		System.out.println("*****************Choose Option********************");
		System.out.println();
		System.out.println("Addition Press :: 1");
		System.out.println("Substruction Press :: 2");
		System.out.println("Multiplaction Press :: 3");
		System.out.println("Divition press Press :: 4");
		int choose=sc.nextInt();
		if(choose==1) {
			System.out.println("Plese tell how manny number you want add ::");
			int n=sc.nextInt();
			System.out.println("Enter "+n+" Number To Addition");
			int[] numbers=new int[n];
			//store values into array
			for(int i=0;i<n;i++) {
				numbers[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<numbers.length;i++) {
				sum=sum+numbers[i];
			}
			System.out.println("Your Some of "+n+" Number is ::"+sum);
		}
		//Substraction logic logic
		else if (choose==2) {
			System.out.println("Enter First no to Substraction ::");
			int num1=sc.nextInt();
			System.out.println("Enter First no to Substraction ::");
			int num2=sc.nextInt();
			int sub=num1-num2;
			System.out.println("Your Substraction of "+num1+" and "+num2+"  Number is ::"+sub);
		}
		//Multiplication logic
		else if(choose==3) {
			System.out.println("Plese tell how manny number you Multiplication ::");
			int n=sc.nextInt();
			System.out.println("Enter "+n+" Number To Multiplacation ");
			int[] numbers=new int[n];
			//store values into array
			for(int i=0;i<n;i++) {
				
				numbers[i]=sc.nextInt();
			}
			int sum=1;
			for(int i=0;i<numbers.length;i++) {
				sum=sum*numbers[i];
			}
			System.out.println("Your Some of "+n+" Number is ::"+sum);
		}
		//Divition logic
		else if(choose==4) {
			System.out.println("Enter First no to Divition ::");
			int num1=sc.nextInt();
			System.out.println("Enter First no to Divition ::");
			int num2=sc.nextInt();
			double div=num1/num2;
			System.out.println("Your Substraction of "+num1+" and "+num2+"  Number is ::"+div);
		}
		else {
			System.out.println("Wrong Choice : Try again");
		}

	}

}
