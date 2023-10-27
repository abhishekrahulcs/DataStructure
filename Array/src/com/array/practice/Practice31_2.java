package com.array.practice;

import java.util.Arrays;

//K’th Smallest/Largest Element in Unsorted Array
public class Practice31_2 {
	public static void main(String[] args) {
    Integer[] arr=new Integer[] {12,3,5,7,19};
    int k=2;
    //function call
    System.out.println("K'th smallest element is : "+kthsmallest(arr,k));
    
	}

	private static int kthsmallest(Integer[] arr, int k) {
		
		Arrays.sort(arr);
		return arr[k-1];
	}


}
