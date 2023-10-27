package com.array.practice;

import java.util.Arrays;

//Minimize the maximum difference between the heights
public class Practice34 {
	//Drivers code
	public static void main(String[] args) {
	   int arr[]= {7,4,8,8,8,9};
	   int k=6;
	   int ans=getMinDiff(arr,arr.length,k);
	   System.out.println(ans);
     
	}

	// user function template for Java
	private static int getMinDiff(int[] arr, int n, int k) {
		Arrays.sort(arr);
		//maximum possible height difference
		int ans=arr[n-1]-arr[0];
		int tempmin,tempmax;
		tempmin=arr[0];
		tempmax=arr[n-1];
		
		for (int i = 1; i < n; i++) {
			//if on subtracting k we got negative then
			//continue
			if (arr[i]-k<0) {
				continue;
			}
			
			//minimum element when we add k to whole array
			tempmin=Math.min(arr[0]+k, arr[i]-k);
			
			// maximum element when we subtract k from whole array
			tempmax=Math.max(arr[i-1]+k,arr[n-1]-k);
			ans=Math.min(ans,tempmax-tempmin);
		}
		return ans;
	}

	
}
