package com.sm.arrays;

public class FindDuplicateElementFromArray {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 10, 40, 20 };
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;
				} // if
			}//j for
		}//i for
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				count++;
			}
		}
		System.out.println("New length of array  : "+count);
	}
}