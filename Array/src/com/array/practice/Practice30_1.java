package com.array.practice;

import java.util.Arrays;

// Find the maximum and minimum element of an array
public class Practice30_1 {
	public static void main(String[] args) {
		int a[]= {1,423,6,46,34,23,13,53,4};
		// Implemented inbuilt function to sort array
		Arrays.sort(a);
		//after sorting 0 th position will be minimum and nth position will be maximum
		System.out.print("MIN-"+a[0]+" MAX-"+a[a.length-1]);
		
	}


}
