package com.bridgelabz.array;
/*
 * Find 2nd Largest Number in an Array
 */
public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int[] array = { 89, 100, 29, 40, 54, 30, 150 };
		searchSecondLargestElement(array);
	}

	public static void searchSecondLargestElement(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			if (i == 1) {
				break;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\nSecond Largest element : " + array[1]);

	}

}
