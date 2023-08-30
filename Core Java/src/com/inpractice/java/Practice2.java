package com.inpractice.java;

import java.util.Scanner;

//How To Remove White Spaces from String In Java?
public class Practice2 {

	public static void main(String[] args) {
		
		//1St approach using builtin method
		//usingBuiltinMethod();
		//2nd approach using Non-builtin method
		usingNonBuiltMethod();
		
		
	}

	private static void usingNonBuiltMethod() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input string to be cleaned from white spaces...!");
		String inputString=scanner.nextLine();
		char[] charArray=inputString.toCharArray();
		String stringWithoutSpaces1="";
		for (int i = 0; i < charArray.length; i++) {
			if ((charArray[i] !=' ') && (charArray[i] != '\t')) {
				stringWithoutSpaces1 = stringWithoutSpaces1 + charArray[i];
			}
		}
		System.out.println("input String "+inputString);
		System.out.println("Input String Without Spaces : "+stringWithoutSpaces1);
		scanner.close();
	}

	private static void usingBuiltinMethod() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input string to be cleaned from white spaces...!");
		String input=sc.nextLine();
		String stringWithoutSpaces=input.replaceAll("\\s+", "");
		System.out.println("Input String "+input);
		System.out.println("Input String without spaces "+stringWithoutSpaces);
		sc.close();
	}
}
