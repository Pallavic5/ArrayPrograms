package com.bridgelabz.array;

public class ReverseElementInArray {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };
		printReverseArray(array);

	}

	public static void printReverseArray(int[] array) {
		System.out.println("Original array elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse array elements are: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

}
