package com.sm.arrays;

public class RemoveElementTestFromArray {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int rn=10;
		for(int i=0;i<a.length;i++) {
			if(a[i]==rn) {
				for (int j = i; j < a.length-1; j++) {
					a[j]=a[j+1];
				}//for
			}//if
			System.out.print(a[i]+" ");
		}//for
	}//main

}//class
