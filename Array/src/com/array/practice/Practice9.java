package com.array.practice;

import java.util.Arrays;

//Write a Java program to find all the leaders in an integer array?
public class Practice9 {

	public static void main(String[] args) {
		findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
		  
        findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});
  
        findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});
  
        findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});
      }


	private static void findTheLeaders(int[] inputArray) {
	
		//getting the input of array length 
		int inputArrayLength=inputArray.length;
		
		//assuming the last element as max
		int max=inputArray[inputArrayLength-1];
		System.out.println("The leaders in "+Arrays.toString(inputArray)+" are : ");
	
		// printing the last elements as always a leader
		System.out.println(inputArray[inputArrayLength-1]);
		
		//Traversing the remaining elements from right to left 
		for (int i = inputArrayLength-2; i >=0; i--) {
			//if the elements is greater than max
			if (inputArray[i]>max) {
				
				//printing the elements
				System.out.println(inputArray[i]);
				max=inputArray[i];
			}
			
		}
		
		
		
	}
}
