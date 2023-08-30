package com.array.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

//Write a Java program to find duplicate elements in an array?
public class Practice1 {

	public static void main(String[] args) {
		int[] inputArray = new int[] { 111, 333, 555, 777, 333, 444, 555 };
		System.out.println("======Duplicates Using Brute Force======");
		findDuplicatesUsingBruteForce(inputArray);
		findDuplicatesUsingSorting(inputArray);
		findDuplicatesUsingHashSet(inputArray);
		findDuplicatesUsingHashMap(inputArray);
		findDuplicatesUsingJava8(inputArray);
	}

	private static void findDuplicatesUsingJava8(int[] inputArray) {
		Set<Integer> uniqueElements=new HashSet<Integer>();
		Set<Integer> duplicateElements=Arrays.stream(inputArray).filter(i->!uniqueElements.add(i)).boxed().collect(Collectors.toSet());
		System.out.println("duplicateElements :"+duplicateElements);
	}

	private static void findDuplicatesUsingHashMap(int[] inputArray) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int element : inputArray) {
			if (map.get(element) == null) {
				map.put(element, 1);
			} else {
				map.put(element, map.get(element) + 1);
			}
		}
        Set<Entry<Integer,Integer>> entryset=map.entrySet();
        for (Entry<Integer, Integer> entry : entryset) {
			if (entry.getValue()>1) {
				System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
			}
		}
	}

	private static void findDuplicatesUsingHashSet(int[] inputArray) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int element : inputArray) {
			if (!set.add(element)) {
				System.out.println("Duplicate Element using HashSet:" + element);
			}
		}

	}

	private static void findDuplicatesUsingSorting(int[] inputArray) {
		Arrays.sort(inputArray);
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] == inputArray[i + 1]) {
				System.out.println("Duplicate Element using sorting:" + inputArray[i]);
			}
		}

	}

	private static void findDuplicatesUsingBruteForce(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j]) {
					System.out.println("Duplicate Element :" + inputArray[i]);
				}
			}

		}

	}

}
