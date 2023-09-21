package com.array.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//How to merge two sorted or unsorted arrays into single sorted array without duplicates in Java?

public class Practice17 {

	public static void main(String[] args) {
		int[] arrayA = new int[] {7, -5, 3, 8, -4, 11, -19, 21};
        
        int[] arrayB = new int[] {6, 13, -7, 0, 11, -4, 3, -5};
        
        int[] mergedArray=mergeArraysAndRemoveDuplicates(arrayA,arrayB);
        	
        System.out.println("Array A :"+Arrays.toString(arrayA));
        System.out.println("Array B :"+Arrays.toString(arrayB));
        System.out.println("Sorted Merged Array with No Duplicates");
        System.out.println(Arrays.toString(mergedArray));
	}

	private static int[] mergeArraysAndRemoveDuplicates(int[] arrayA, int[] arrayB) {
		//Step 1:Merging of Two Array
		// Defining mergedArray with combined size of arrayA and arrayB
		int[] mergedArray=new int[arrayA.length+arrayB.length];
		int i=0,j=0,k=0;
		//Inserting all elements of arrayA in to merged Array
		while (i<arrayA.length) {
			mergedArray[k]=arrayA[i];
			k++;
			i++;
		}
		//Inserting all elemnts if arrayB in to merged Array
		while (j<arrayB.length) {
			mergedArray[k]=arrayB[j];
            k++;
            j++;
		}
		//step 2.Removed duplicates from merged array
		Set<Integer> setWithNoDuplicates=new HashSet<Integer>();
		for (int l = 0; l < mergedArray.length; l++) {
			setWithNoDuplicates.add(mergedArray[l]);
		}
		
		//Now, setWithNoDuplicates will have only unique elements of mergedArray
        
        //So, now iterate setWithNoDuplicates and 
        //add its elements into new array called mergedArrayWithNoDuplicates
		Iterator<Integer> it=setWithNoDuplicates.iterator();
		int[] mergeArrayWithNoDuplicates=new int[setWithNoDuplicates.size()];
		int n=0;
		while (it.hasNext()) {
			mergeArrayWithNoDuplicates[n]=it.next();
			n++;
		}
		
		//sorting merged array with removing dulicates
		Arrays.sort(mergeArrayWithNoDuplicates);
		
		return mergeArrayWithNoDuplicates;
	}

}
