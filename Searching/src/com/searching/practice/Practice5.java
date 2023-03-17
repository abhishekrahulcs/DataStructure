package com.searching.practice;

//Find a Fixed Point (Value equal to index) in a given array using Linear Search

public class Practice5 {

	public static void main(String[] args) {
		int arr[]= { -10, -1, 0, 3, 10, 11, 30, 50, 100 };
        int n = arr.length;
        System.out.println("Fixed Point is "
                           + linearSearch(arr, n));
		
	}

	static int linearSearch(int arr[], int n) {

		for (int j = 0; j < n; j++) {
			if (arr[j] == j) {
				return j;
			}
		}
		return -1;

	}
	
	
}
