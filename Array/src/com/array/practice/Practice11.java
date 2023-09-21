package com.array.practice;

import java.util.Arrays;
import java.util.HashMap;

//Write a Java program to count occurrences of each element in an array?
public class Practice11 {

	public static void main(String[] args) {  
		arrayElementCount(new int[]{4, 5, 4, 5, 4, 6});
        
        System.out.println("-------------------------");
          
        arrayElementCount(new int[]{12, 9, 12, 9, 10, 9, 10, 11});
          
        System.out.println("-------------------------");
          
        arrayElementCount(new int[]{891, 187, 891, 187, 891, 476, 555, 741});
		
	}

	private static void arrayElementCount(int[] inputArray) {
	
	//Creating a HashMap object with elements of inputArray as keys and their count as values
     HashMap<Integer,Integer> elementCountMap=new HashMap<Integer,Integer>();
     
   //checking every element of the inputArray
     for (int i : inputArray) {
	    if (elementCountMap.containsKey(i)) {
	    	elementCountMap.put(i, elementCountMap.get(i)+1);
		}else {
			elementCountMap.put(i, 1);
		}	
	}
     System.out.println("Input Array : "+Arrays.toString(inputArray));
     System.out.println("Element Count :"+elementCountMap);
     
	}
	
	

}
