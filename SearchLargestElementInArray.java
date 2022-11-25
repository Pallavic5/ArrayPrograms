package com.bridgelabz.array;
/*
 * Program to print the largest element in an array.
 */
public class SearchLargestElementInArray {

	public static void main(String[] args) {
		int[] myArray = { 75, 87, 25, 12, 93 };
		printLargestElement(myArray);
	}

	private static void printLargestElement(int[] myArray) {
		int maximumElement = myArray[0];
		for (int i = 1; i < myArray.length; i++) {
			if (myArray[i] > maximumElement) {
				maximumElement = myArray[i];
			}
		}
		System.out.println("The Largest Element into an array : " + maximumElement);
	}

}
