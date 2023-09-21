package com.array.practice;

//Write a Java program to find a missing number in an integer array?
public class Practice10 {

	public static void main(String[] args) {  
		int n=8;
		int[] a= {1,4,5,3,7,8,6};
		//step 1
		int sumOfNumbers=sumOfNumbers(n);
		//step 2
		int sumsumOfElements=sumOfElements(a);
        //step 3
		int missingNumbers=sumOfNumbers-sumsumOfElements;
		System.out.println("Missing Number is = "+missingNumbers);
	}
	
	//method to calculate sum of n numbers
	static int sumOfNumbers(int n) {
		int sum=(n*(n+1))/2;
		return sum;
	}
	// method to calculate sum of all elements of array
	static int sumOfElements(int[] array) {
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum=sum+array[i];
		}
		return sum;
	}
	

}
