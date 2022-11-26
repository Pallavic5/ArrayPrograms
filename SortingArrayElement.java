package com.bridgelabz.array;
/*
 * Program to sort the elements of an array in ascending order  
 */
public class SortingArrayElement {

	public static void main(String[] args) {
		int[] array = { 38, 52, 9, 18, 6, 62, 13 };
		sortElementInAscendingOrder(array);

	}

	public static void sortElementInAscendingOrder(int[] array) {
		int min, temp = 0;
		for (int i = 0; i < array.length; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		System.out.println("Sorted array element in ascending order: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
