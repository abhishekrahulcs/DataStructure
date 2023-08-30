package com.inpractice.java;

import java.util.HashMap;
import java.util.Set;

//Write a Java program to find the duplicate words and their number of occurrences in a string?
public class Practice4 {

	public static void main(String[] args) {

		duplicateWordCount("Bread butter and Bread");

		duplicateWordCount("Java is java again java");

		duplicateWordCount("Super Man Bat Man Spider Man");

	}

	private static void duplicateWordCount(String inputString) {

		// Splitting inputString into words
		String[] words = inputString.split(" ");
		// Creating one HashMap with words as key and their count as value
		HashMap<String, Integer> countDuplicateWord = new HashMap<String, Integer>();

		for (String word : words) {

			if (countDuplicateWord.containsKey(word)) {

				countDuplicateWord.put(word, countDuplicateWord.get(word) + 1);
			} else {

				countDuplicateWord.put(word, 1);
			}
		}
		Set<String> wordKey = countDuplicateWord.keySet();
		for (String word : wordKey) {
			if (countDuplicateWord.get(word) > 1) {
				System.out.println(word + " : " + countDuplicateWord.get(word));
			}
		}
	}
}
