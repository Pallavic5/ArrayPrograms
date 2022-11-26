package com.bridgelabz.array;

/*
 * Program to print the elements of an array present on an even position.
 */
public class EvenPositionElement {

	public static void main(String[] args) {
		int[] array = { 10, 49, 35, 20, 68, 43, 12, 90, 100 };
		printEvenPositionElement(array);

	}

	public static void printEvenPositionElement(int[] array) {
		System.out.println("Elements in original array are:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println("\nEven position elements in array are:");
		for (int i = 1; i < array.length; i = i + 2) {
			System.out.print((array[i] + " "));
		}
	}

}
