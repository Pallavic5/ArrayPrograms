package com.bridgelabz.array;
/*
 * Program to print the elements of an array.
 */
import java.util.Scanner;

public class PrintElements {

	public static void main(String[] args) {
		printElements();
	}

	public static void printElements() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int lengthOfArray = scanner.nextInt();
		int[] array = new int[lengthOfArray];

		System.out.println("Enter the values of an array : ");
		for (int i = 0; i < lengthOfArray; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Print the elements of an array: ");
		for (int elements : array) {
			System.out.print(elements + " ");
		}
		scanner.close();
	}

}
