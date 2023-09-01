package com.array.practice;

import java.util.Arrays;

//Moving Zeros To End Of An Array
public class Practice7 {

	public static void main(String[] args) {
		moveZerosToEnd(new int[] { 12, 0, 7, 0, 8, 0, 3 });

		moveZerosToEnd(new int[] { 1, -5, 0, 0, 8, 0, 1 });

		moveZerosToEnd(new int[] { 0, 1, 0, 1, -5, 0, 4 });

		moveZerosToEnd(new int[] { -4, 1, 0, 0, 2, 21, 4 });
	}

	private static void moveZerosToEnd(int[] inputArray) {
		int counter = 0;
		// traversing array from left to right
		for (int i = 0; i < inputArray.length; i++) {
			// if inputArray[i] is non zero
			if (inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter++;
			}

		}
		// assigning elements to remaining elements
		while (counter < inputArray.length) {
			inputArray[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(inputArray));
	}

}
