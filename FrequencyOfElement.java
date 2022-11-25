package com.bridgelabz.array;
/*
 * 
 */
public class FrequencyOfElement {

	public static void main(String[] args) {

		int[] array = { 2, 8, 3, 2, 2, 8, 5, 1, 3 }; // initialize array

		int[] frequencyArray = new int[array.length]; // this array will store frequencies of element
		int visited = -1;

		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					frequencyArray[j] = visited; // to avoid counting same element again.
				}
			}

			if (frequencyArray[i] != visited) {
				frequencyArray[i] = count;
			}
		}
			//Display Frequency of elements of array.
		for (int i = 0; i < frequencyArray.length; i++) {
			if (frequencyArray[i] != visited) {
				System.out.println("Elements | Frequency");
				System.out.println(array[i] + "        | " + frequencyArray[i]);
			}
		}

	}

}
