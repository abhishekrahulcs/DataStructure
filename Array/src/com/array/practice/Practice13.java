package com.array.practice;

import java.util.Arrays;

//Write a Java program to remove duplicate elements from an array?
public class Practice13 {

	public static void main(String[] args) {  
		removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
        
        removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
          
        removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
          
        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});		
	}

	private static void removeDuplicates(int[] arrayWithDuplicates) {
		
		System.out.println("Array With Duplicates :");
		for (int i = 0; i < arrayWithDuplicates.length; i++) {
			System.out.println(arrayWithDuplicates[i]+"\t");
		}
		//Assuming all elements in input array are unique
		int noOfUniqueElements=arrayWithDuplicates.length;
		//Comparing each element with all other elements
		for (int i = 0; i < noOfUniqueElements; i++) {
			for (int j = i+1; j < noOfUniqueElements; j++) {
				//if any two elements are found to be equal
				if (arrayWithDuplicates[i]==arrayWithDuplicates[j]) {
					arrayWithDuplicates[j]=arrayWithDuplicates[noOfUniqueElements-1];
					// Decrementing no of unique elements 
					noOfUniqueElements--;
					// Decrementing j
					j--;
				}
			}
		}
		int[] arrayWithoutDuplicates= Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
		//printing array without duplicates 
		System.out.println();
		System.out.println("Array Without Duplicates : ");
		for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
		System.out.println(arrayWithoutDuplicates[i]+"\t");	
		}
		System.out.println();
        
        System.out.println("==============================");
		
	}
}
