package com.array.practice;

import java.util.Arrays;
import java.util.HashSet;

// Write a Java program to find array triplets such that sum of first two elements equals the third element?
public class Practice26 {

	public static void main(String[] args) {
		 getArrayTriplets(new int[] {21, 13, 47, 61, 34, 40, 55, 71, 87});
		 getArrayTriplets(new int[] {-1, 3, -2, 1, -4, 0, 5, 2, -3});
	}

	private static void getArrayTriplets(int[] inputArray) {
		System.out.println("Input Array : " + Arrays.toString(inputArray));
		// Creating Hashset called Element set
		HashSet<Integer> elementSet = new HashSet<>();
        
		for (Integer integer : inputArray) {
			elementSet.add(integer);
			
		}
		System.out.println("Array triplets with sum of first two elements equals third :");
		for (int i = 0; i < inputArray.length-1; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
			//checking element set contains sum of two element or not 
				if (elementSet.contains(inputArray[i]+inputArray[j])) 
                {
                    System.out.println("["+inputArray[i]+", "+inputArray[j]+", "+(inputArray[i]+inputArray[j])+"]");
                }
				
			}
			
		}
	}

}
