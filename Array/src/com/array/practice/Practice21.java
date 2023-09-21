package com.array.practice;

import java.util.Arrays;

//Write a Java program to find contiguous sub array with maximum sum?

public class Practice21 {

	public static void main(String[] args) {
		 getSubArrayWithMaxSum(new int[] {2, -3, 7, -4, 2, 5, -8, 6, -1});
        
	}

	private static void getSubArrayWithMaxSum(int[] inputArray) {
		int bestSum = inputArray[0];
		int bestStart = 0;
		int bestEnd = 0;

		int currentSum = 0;
		int currentStart = 0;
		
		for (int i = 0; i < inputArray.length; i++) {
			//adding current Element to currentSum
			currentSum=currentSum+inputArray[i];
			////If currentSum becomes negative, clearing currentSum and
            //setting currentStart to next element
			if (currentSum < 0) {
				currentSum = 0;
				currentStart = i + 1;
			} else if (currentSum > bestSum) {
				bestSum = currentSum;
				bestStart = currentStart;
				bestEnd = i;
			}
		}
			    System.out.println("Input Array : "+Arrays.toString(inputArray));
	          
		        System.out.print("Continous Sub Array With Maximum Sum : ");
		          
		        System.out.print("[ ");
		        for (int j = bestStart; j < bestEnd; j++) {
					System.out.print(inputArray[j]+" ");
				}
		        
		        System.out.print("]");
		          
		        System.out.println();
		          
		        System.out.println("Sum : "+bestSum);
		
		
		
	}


}
