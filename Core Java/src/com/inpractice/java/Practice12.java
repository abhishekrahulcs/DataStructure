package com.inpractice.java;

import java.util.HashMap;


//Write Java Program To Check Whether Two Strings Are Anagram Or Not?
//3)Anagram Program In Java Using HashMap
public class Practice12 {

	public static void main(String[] args) {
		isAnagram("Mother In Law", "Hitler Woman");

		isAnagram("keEp", "peeK");

		isAnagram("SiLeNt CAT", "LisTen AcT");

		isAnagram("Debit Card", "Bad Credit");

		isAnagram("School MASTER", "The ClassROOM");

		isAnagram("DORMITORY", "Dirty Room");

		isAnagram("ASTRONOMERS", "NO MORE STARS");

		isAnagram("Toss", "Shot");

		isAnagram("joy", "enjoy");
	}

	private static void isAnagram(String string1, String string2) {

		// Removing white spaces from s1 and s2 and converting case to lower case
		String copyOfS1 = string1.replaceAll("\\s", "").toLowerCase();
		String copyOfS2 = string2.replaceAll("\\s", "").toLowerCase();

		// Initially setting status as true

		boolean status = true;

		if (copyOfS1.length() != copyOfS2.length()) {
			// Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

			status = false;
		} else {
			// Constructing a map containing character as a key and character occurrences as
			// a value

			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (int i = 0; i < copyOfS1.length(); i++) {

				// Getting char from copyOfs1
				char charAsKey = copyOfS1.charAt(i);
				// Initializing char count to 0
				int charCountAsValue = 0;
				// Checking whether map contains this char
				if (map.containsKey(charAsKey)) {
					// If contains, retrieving it's count
					charCountAsValue = map.get(charAsKey);
				}
				// Putting char and it's count to map with pre-incrementing char count
				map.put(charAsKey, ++charCountAsValue);
				charAsKey = copyOfS2.charAt(i);
				// Initializing char count to 0

				charCountAsValue = 0;
				// Checking whether map contains this char
				if (map.containsKey(charAsKey)) {
					// If contains, retrieving it's count
					charCountAsValue = map.get(charAsKey);
				}

				// Putting char and it's count to map with pre-decrementing char count
				map.put(charAsKey, --charCountAsValue);

			}
			// Checking each character and it's count
			for (int value : map.values()) {
				if (value != 0) {
					status = false;
				}
			}
		}
		if (status) {
			System.out.println("Both Strings Are Anagram");
		} else {
			System.out.println("Both Strings Are not Anagram");
		}

	}

}
