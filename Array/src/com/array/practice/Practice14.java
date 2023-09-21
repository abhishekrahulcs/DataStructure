package com.array.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//Write a Java program to find the most frequent element in an array?
public class Practice14 {

	public static void main(String[] args) {  
		getMostFrequentElement(new int[]{4, 5, 8, 7, 4, 7, 6,7});
        
        getMostFrequentElement(new int[]{1, 2, 7, 5, 3, 6});
			
	}

	private static void getMostFrequentElement(int[] inputArray) {
		
	    //Creating HashMap object with elements as keys and their occurrences as values
		HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();    
		 //Inserting all the elements of inputArray into elementCountMap
		for(int i:inputArray)
		{
			if (elementCountMap.containsKey(i)) {
				elementCountMap.put(i, elementCountMap.get(i)+1);
			}else {
				elementCountMap.put(i, 1);
			}
		}
		int element=0;
		int frequency=1;
		//Iterating through elementCountMap to get the most frequent element and its frequency
        
		Set<Entry<Integer,Integer>> entrySet=elementCountMap.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				element=entry.getKey();
				frequency=entry.getValue();
			}
		}
		// Printing the most frequent element in array and its frequnecy
		if (frequency>1) {
			System.out.println("Input Array : "+Arrays.toString(inputArray));
            
            System.out.println("The most frequent element : "+element);
              
            System.out.println("Its frequency : "+frequency);
              
            System.out.println("========================");
		}else {
			System.out.println("Input Array : "+Arrays.toString(inputArray));
            
            System.out.println("No frequent element. All elements are unique.");
              
            System.out.println("=========================");
		}
		
	}
}
