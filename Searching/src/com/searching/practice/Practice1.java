package com.searching.practice;

//Binary search basic iterative approach
public class Practice1 {

	// Returns index of x if it is present in arr[],
	// else return -1
	static int binarySearch(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			// find mid
			int mid = start + (end - start) / 2;

			if (arr[mid] == target)
				return mid;
		    else if (arr[mid] > target) 
				end = mid - 1;
			else 
				start = mid + 1;
			

		}

		return -1;
	}




	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 4;
		int result = binarySearch(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
		    System.out.println(x + " Found at Index: " + binarySearch(arr, x));

	}

}
