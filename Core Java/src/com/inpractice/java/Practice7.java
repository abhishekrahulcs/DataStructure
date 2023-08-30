package com.inpractice.java;

import java.util.HashMap;


//Java Program To Count Occurrences Of Each Character In String 
public class Practice7 {

	public static void main(String[] args) {
		characterCount("Java J2EE Java JSP J2EE");

		characterCount("All Is Well");

		characterCount("Done And Gone");
	}

	private static void characterCount(String inputString) {

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] charArray = inputString.toCharArray();
		for (char ch : charArray) {
			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);

			} else {

				charCountMap.put(ch, 1);
			}
		}
		System.out.println(inputString + " : " + charCountMap);
	}

}
