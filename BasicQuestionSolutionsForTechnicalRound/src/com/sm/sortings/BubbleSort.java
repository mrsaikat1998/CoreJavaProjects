package com.sm.sortings;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 100, 57, 92, 26, 37, 200 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				} // end if
			} // j for
		} // i for
		for (int i = 1;i<=array.length  ; i++) {
			System.out.print(array[(array.length - i)]+" ");
		}
	}// main

}// class
