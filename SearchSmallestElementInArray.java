package com.bridgelabz.array;
/*
 * Program to print the smallest element in an array.
 */
public class SearchSmallestElementInArray {

	public static void main(String[] args) {
		int[] myArray = { 75, 87, 25, 12, 93 };
		printSmallestElement(myArray);
	}

	public static void printSmallestElement(int[] myArray) {
		int minimumElement = myArray[0];
		for (int i = 1; i < myArray.length; i++) {
			if (myArray[i] < minimumElement) {
				minimumElement = myArray[i];
			}
		}
		System.out.println("The Smallest Element into an array: " + minimumElement);

	}

}
