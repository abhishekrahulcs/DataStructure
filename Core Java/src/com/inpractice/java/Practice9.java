package com.inpractice.java;

import java.util.Arrays;

//Write Java Program To Check Whether Two Strings Are Anagram Or Not?
//1) Anagram Program In Java Using sort() and equals() Methods
public class Practice9 {

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

		// Removing all white spaces from s1 and s2
		String copyOfS1 = string1.replaceAll("\\s", "");
		String copyOfS2 = string2.replaceAll("\\s", "");
		// Initially setting status as true
		boolean status = true;
		if (copyOfS1.length() != copyOfS2.length()) {
			//// Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

			status = false;
		} else {

			// Changing the case of characters of both copyOfs1 and copyOfs2 and converting
			// them to char Array
			char[] s1Array = copyOfS1.toLowerCase().toCharArray();
			char[] s2Array = copyOfS2.toLowerCase().toCharArray();

			// Sorting them
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);

			// checking whether s1 and s2 are equal
			status = Arrays.equals(s1Array, s2Array);

		}
		if (status) {
			System.out.println("Both Strings Are Anagram");
		} else {
			System.out.println("Both Strings Are not Anagram");
		}

	}

}
