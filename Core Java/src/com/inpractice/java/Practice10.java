package com.inpractice.java;

import java.util.Arrays;

//Write Java Program To Check Whether Two Strings Are Anagram Or Not?
//2) Anagram Program In Java Using Iterative Methods
public class Practice10 {

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

		// Removing white spaces from s1 and s2 and changing case to lower
		String copyOfS1 = string1.replaceAll("\\s", "").toLowerCase();
		String copyOfS2 = string2.replaceAll("\\s", "").toLowerCase();
		// Initially setting status as true
		boolean status = true;
		if (copyOfS1.length() != copyOfS2.length()) {
			// Setting status as false if copyOfs1 and copyOfS2 doesn't have same length
			status = false;
		} else {
			// Converting copyOfs1 to char array
			char[] s1ToArray = copyOfS1.toCharArray();

			// Checking whether each character of s1ToArray is present in copyOfS2
			for (char c : s1ToArray) {
				int index = copyOfS2.indexOf(c);
				if (index != -1) {
					// If character is present in copyOfS2, removing that char from copyOfS2
					copyOfS2 = copyOfS2.substring(0, index) + copyOfS2.substring(index + 1, copyOfS2.length());

				} else {
					// If character is not present in copyOfs2, setting status as false and breaking
					// the loop
					status = false;
					break;

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
