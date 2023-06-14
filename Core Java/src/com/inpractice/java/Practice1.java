package com.inpractice.java;
//Write a java program to reverse a string?
public class Practice1 {

	public static void main(String[] args) {
		String str = "MyJava";
		// 1. Using StringBuffer Class
		StringBuffer sbf = new StringBuffer(str);
		sbf.reverse();
		System.out.println(sbf);

		// 2.using iterating method
		char[] strArray = str.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		// 3.Recursive way to reverse
		System.out.println(recursiveMethod(str));
	}

	private static String recursiveMethod(String str) {
	
		if ((null==str)||(str.length()<=1)) {
			return str;
		}
		
		return recursiveMethod(str.substring(1))+str.charAt(0);
		/*
		 * 1st Call —> recursiveMethod(“MyJava”) 
		 * 2nd Call —> recursiveMethod(“yJava”) +“M”
		 * 3rd Call —> (recursiveMethod(“Java”) + “y”) + “M”
		 *  4th call —>((recursiveMethod(“ava”) + “J”)+”y”) + “M”
		 *  5th Call —>(((recursiveMethod(“va”) + “a”) + “J”)+”y”) + “M” 
		 * 6th Call —>((((recursiveMethod(“a”) + “v”) + “a”) + “J”)+”y”) + “M”
		 * 
		 */
	}
}
