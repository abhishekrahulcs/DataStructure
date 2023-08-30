package com.inpractice.java;

import java.util.HashMap;
import java.util.Set;

// How to find duplicate characters and their count in string in Java?
public class Practice3 {

	public static void main(String[] args) {

		duplicateCharCount("JavaJ2EE");

		duplicateCharCount("Fresh Fish");

		duplicateCharCount("Better Butter");

	}

	private static void duplicateCharCount(String inputString) {
		// Creating a HashMap containing char as key and it's occurrences as value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		// Converting given string to char array
		char[] charArray = inputString.toCharArray();

		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		// Getting a Set containing all keys of charCountMap
		Set<Character> charsInString = charCountMap.keySet();
		System.out.println("Duplicate character in String :" + inputString);
		// Iterating through Set 'charsInString'
		for (Character ch : charsInString) {
			if (charCountMap.get(ch) > 1) {
				System.out.println(ch + ":" + charCountMap.get(ch));
			}
		}

	}
}
