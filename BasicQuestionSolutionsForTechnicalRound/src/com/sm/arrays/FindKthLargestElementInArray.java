package com.sm.arrays;

public class FindKthLargestElementInArray {

	public static void main(String[] args) {
		int[] a = { 10, 50, 60, 30, 70, 80, 20 };
		int k = 3;
		int temp = 0;
		for (int i = 0; i < k; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				} // if
			} // j for
			if (i == k - 1)
				System.out.println(a[i]);
		}

	}
}
