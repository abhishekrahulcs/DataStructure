package com.inpractice.java;

import java.util.Scanner;

//Write a Java program to count the number of words in a string?
public class Practice5 {

	public static void main(String[] args) {

		//way1();
		way2();
	}

	private static void way1() {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.trim().split(" ");
		System.out.println("Number of words in the string = " + words.length);
		sc.close();
	}

	private static void way2() {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1)!= ' ')) {
				count++;
			}

		}
		System.out.println("Number of words in the string = " + count);
		sc.close();
	}

}
