package com.array.practice;

import java.util.Arrays;

//How to sort an array of 0s, 1s and 2s in Java?
public class Practice24 {

	public static void main(String[] args) {
		sortArray(new int[] { 1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0 });
	}

	private static void sortArray(int[] inputArray) {

		System.out.println("Array Before Sorting :" + Arrays.toString(inputArray));

		// Initialising low and mid to zero
		int low = 0;
		int mid = 0;
		// and high to last index
		int high = inputArray.length - 1;

		// untill mid does not cross high
		while (mid <= high) {
			// if element is zero bring it to begining
			if (inputArray[mid] == 0) {
				swap(inputArray, low, mid);
				low++;
				mid++;
			}
			// if element is 2, Send it to end
			else if (inputArray[mid] == 2) {
				swap(inputArray, mid, high);
				high--;
			}
			//// If an element is 1, let it be there only
			else {
				mid++;
			}

		}

		System.out.println("Array After Sorting : " + Arrays.toString(inputArray));

	}

	private static void swap(int[] inputArray, int i, int j) {
		int temp=inputArray[i];
		inputArray[i]=inputArray[j];
		inputArray[j]=temp;
	}

}
