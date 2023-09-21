package com.array.practice;

import java.util.Arrays;
import java.util.HashMap;

//Write a Java program which prints all contiguous sub arrays with given sum?

public class Practice22 {

   	public static void main(String[] args) {
     hashingMethod(new int[] {2, 4, 2, 8, 3, 3, 2, -4, 12},8);     
	}

	private static void hashingMethod(int[] inputArray, int givenSum) {
		
		System.out.println("Given Array :"+Arrays.toString(inputArray));
		
		System.out.println("Given Sum :"+givenSum);
		
		System.out.println("Contigous subarray with given sum " +givenSum+ " Are :");
		
		//Initialising current sum to 0
		int currentSum=0;
		
		// Defining sumIndexMap with currentSum as key and index as values
		HashMap<Integer, Integer> sumIndexMap=new HashMap<Integer, Integer>();
		
		sumIndexMap.put(0, -1);
		
		//Iterating Each element of Input Array
		for (int i = 0; i < inputArray.length; i++) {
			
			// adding current element to currentSum
			currentSum=currentSum+inputArray[i];
			// checking whether sumIndexMap contains (currentSum-givenSum)
			if (sumIndexMap.containsKey(currentSum-givenSum)) {
				//If it contains, printing sub array
				printSubArray(inputArray,sumIndexMap.get(currentSum-givenSum)+1,i);
				
			}
			sumIndexMap.put(currentSum, i);
		}
		
		
		
	}

	private static void printSubArray(int[] inputArray, int start, int end)
    {
        System.out.print("[");
          
        for (int i = start; i <= end; i++) 
        {
            System.out.print(" "+inputArray[i]);
        }
          
        System.out.println(" ]");
    }
      
}
