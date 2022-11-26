package com.bridgelabz.array;

/*
 * Program to print the duplicate elements of an array
 */
public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int[] array = { 3, 5, 4, 3, 2, 2, 1 };
		printDuplicateElements(array);

	}

	public static void printDuplicateElements(int[] array) {
		System.out.println("Duplicate elements are: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					System.out.print(array[j] + " ");
				}
			}
		}

	}

}
