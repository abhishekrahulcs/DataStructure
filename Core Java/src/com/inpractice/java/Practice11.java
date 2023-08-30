package com.inpractice.java;

//Write Java Program To Check Whether Two Strings Are Anagram Or Not?
//3) Anagram Program In Java Using StringBuilder
public class Practice11 {

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

		// Removing white spaces from s1 and s2 and converting case to lower
		String copyOfS1 = string1.replaceAll("\\s", "").toLowerCase();
		String copyOfS2 = string2.replaceAll("\\s", "").toLowerCase();

		// Initially setting status as true

		boolean status = true;

		if (copyOfS1.length() != copyOfS2.length()) {
			// Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
			status = false;
		} else {
			//// Converting copyOfs1 to char array
			char[] s1Array = copyOfS1.toCharArray();
			// Constructing StringBuilder from copyOfs2
			StringBuilder sb = new StringBuilder(copyOfS2);
			// Checking whether each character of s1Array is present in sb

			for (char c : s1Array) {
				int index = sb.indexOf("" + c);
				if (index != -1) {
					// If present, removing that character from sb
					sb = sb.deleteCharAt(index);
				} else {

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
