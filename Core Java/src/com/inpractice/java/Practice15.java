package com.inpractice.java;

//String To Integer And Integer To String Conversion In Java
public class Practice15 {

	public static void main(String[] args) {
		StringToIntegerUsingParseInt("2015");
		StringToIntegerUsingValueOf("2015");
		IntegerToStringUsingToString(2015);
		IntegerToStringUsingvalueOf(2015);
	}

	private static void IntegerToStringUsingvalueOf(int i) {
	String convertednum=String.valueOf(i);
	System.out.println(convertednum);
		
	}

	// Java Program To Convert Integer To String Using Integer.toString() Method
	private static void IntegerToStringUsingToString(int i) {
		String covertednum = Integer.toString(i);
		System.out.println(covertednum);

	}
	//Java Program To Convert String To Integer Using Integer.valueOf() method :
	private static void StringToIntegerUsingValueOf(String inputString) {
	   int convertednum=Integer.valueOf(inputString);
	   System.out.println(convertednum);
		
	}

	// Java Program To Convert String To Integer Using Integer.parseInt() method
	private static void StringToIntegerUsingParseInt(String inputString) {

		int convertedNum = Integer.parseInt(inputString);
		System.out.println(convertedNum);
	}
	
}