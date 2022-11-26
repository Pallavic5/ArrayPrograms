package com.bridgelabz.array;
/*
 * Program to print the elements of an array present on odd position.
 */
public class OddPositionElement {

	public static void main(String[] args) {
		int[] array = { 10, 49, 35, 20, 68, 43, 12, 90, 100 };
		printOddPositionElement(array);

	}

	public static void printOddPositionElement(int[] array) {
		System.out.println("Elements in original array are:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println("\nOdd position elements in an array are: ");
		for(int i = 1; i < array.length; i = i + 2) {
			System.out.print(array[i] + " ");
		}
		
	}

}
