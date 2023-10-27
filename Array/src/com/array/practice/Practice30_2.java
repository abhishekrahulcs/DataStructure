package com.array.practice;

import java.util.Arrays;

// Find the maximum and minimum element of an array
public class Practice30_2 {
	public static void main(String[] args) {
		int a[]= {1,423,6,46,34,23,13,53,4};
		int n=a.length;
		System.out.println("Minimum Element of an array :"+getMin(a,n));

		System.out.println("Maximun Element of an array :"+getMax(a,n));
	}

	private static int getMax(int[] a, int n) {
		
		int res=a[0];
		for (int i = 1; i < a.length; i++) {
			res=Math.max(res,a[i]);
		}
		
		return res;
	}

	private static int getMin(int[] a, int n) {
       int res=a[0];
       for (int i = 1; i < a.length; i++) {
		res=Math.min(res, a[i]);
	}
		
		return res;
	}


}
