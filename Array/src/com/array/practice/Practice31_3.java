package com.array.practice;

import java.util.Iterator;

//K’th Smallest/Largest Element in Unsorted Array using Binary Search
public class Practice31_3 {
	//Drivers code
	public static void main(String[] args) {
    int arr[]= {1,4,5,2,19,7};
    int k=3;
    // Function call
    System.out.println("Kth smallest Element is "+kthsmallest(arr,k));
    
	}

	private static int kthsmallest(int[] nums, int k) {
		int low=Integer.MAX_VALUE;
		int high=Integer.MIN_VALUE;
		
		// calculate maximum and minimum of the array
		for (int i = 0; i < nums.length; i++) {
			low=Math.min(low, nums[i]);
			high=Math.max(high, nums[i]);
		}
		
		// our answer lies between minimum and maximum element of the array on which binary search applied
		while (low<high) {
			int mid=low+(high-low)/2;
			
			if(count(nums,mid)<k) {
				low=mid+1;
			}else {
				high=mid;
			}
			
		}
		return low;
	}

	private static int count(int[] nums, int mid) {
		//function to calculate numbers of elements less than equal to mid
		int cnt=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]<=mid) {
				cnt++;
			}
		}
		return cnt;
	}


}
