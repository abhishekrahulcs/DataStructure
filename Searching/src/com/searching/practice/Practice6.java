package com.searching.practice;

//Find a Fixed Point (Value equal to index) in a given array using Binary Search

public class Practice6 {

	public static void main(String[] args) {
		int arr[] = { -10, -1, 0, 3, 10, 11, 30, 50, 100 };
		int n = arr.length;
		System.out.println("Fixed Point is " + binarySearch(arr, 0, n - 1));

	}
	private static int binarySearch(int[] arr, int low, int high) {

		if (high >= low) {

			int mid = low + (high - low) / 2;
			
			if (mid == arr[mid])
				return mid;
			
			int res = -1;
			
			if (mid + 1 <= arr[high])
				res = binarySearch(arr, (mid + 1), high);
			
			if (res != -1)
				return res;
			
			if (mid - 1 >= arr[low])
				return binarySearch(arr, low, (mid - 1));
		}
		
		return -1;

	}
}
