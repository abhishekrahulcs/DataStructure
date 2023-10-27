package com.array.practice;

import java.util.Iterator;

//Sorting 0,1 and 2 without using Sorting algorithm
public class Practice32 {
	//Drivers code
	public static void main(String[] args) {
		int arr[]= {0,1,1,0,1,2,1,2,2};
		int arr_size=arr.length;
		sort012(arr,arr_size);
		printArray(arr,arr_size);
	}

	private static void printArray(int[] arr, int arr_size) {
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
	}

	private static void sort012(int[] arr, int arr_size) {
		int low=0;
		int mid=0;
		int tmp=0;
		int high=arr_size-1;
		while (mid<=high) {
			switch (arr[mid]) {
			case 0:
				{
					tmp=arr[low];
					arr[low]=arr[mid];
					arr[mid]=tmp;
					low++;
					mid++;
				}
				break;
			case 1:
				   mid++;
				break;
			case 2:
			    {
				tmp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=tmp;
				high--;
			}
				break;
			}		}
	}

}
