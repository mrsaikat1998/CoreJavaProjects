package com.sm.arrays;

public class RemoveDuplicateElementFromArray {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 10, 40, 20 };
		int t = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					
					for (int k = j; k < a.length - t; k++) {
						a[k] = a[k + 1];
					} // k for
					t++;
				} // if
			} // j for
		} // i for
		System.out.println(a.length - t);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
