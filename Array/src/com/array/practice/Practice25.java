package com.array.practice;

import java.util.Arrays;

//Write a Java program which finds triplets in the given array whose sum is equal to given number?
public class Practice25 {

	public static void main(String[] args) {
		getArrayTriplets(new int[] {7, 5, 9, 3, 0, 8, 6}, 12);
	}

	private static void getArrayTriplets(int[] inputArray, int sum) {
		System.out.println("Input Arrays :"+Arrays.toString(inputArray));
		System.out.println("Given Sum : "+sum);
		System.out.println("Arrays Triplet whose sum is :"+sum+" are:");
		//using sorting
		Arrays.sort(inputArray);
		
		for (int i = 0; i < inputArray.length-2; i++) {
				int left=i+1;
				int right=inputArray.length-1;
				while (left<right) {
					if (inputArray[i]+inputArray[left]+inputArray[right]==sum) {
						System.out.println("["+inputArray[i]+","+inputArray[left]+","+inputArray[right]+"]");
						left++;
						right--;
					}else if(inputArray[i]+inputArray[left]+inputArray[right]<sum) {
						left++;
						
					}else {
						right--;
					}
				}
		}
		
	}
}
