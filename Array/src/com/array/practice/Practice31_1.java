package com.array.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice31_1 {
	public static void main(String[] args) {
    Integer arr[]=new Integer[] {1, 23, 12, 9, 30, 2, 50 };		
    int k=3;
    kLargest(arr,k);

	int[] prim_array= {1, 23, 12, 9, 30, 2, 50 };	
	
	System.out.println(kLargest(prim_array,k));
	}

	private static ArrayList<Integer> kLargest(int[] prim_array, int k) {
     		//converting using stream
		Integer[] obj_array=Arrays.stream(prim_array).boxed().toArray(
                Integer[] ::new);
		Arrays.sort(obj_array, Collections.reverseOrder());
		ArrayList<Integer> list=new ArrayList<Integer>(k);
		for (int i = 0; i < k; i++) {
			list.add(obj_array[i]);
		}
		
		return list;
	}

	private static void kLargest(Integer[] arr, int k) {
	 Arrays.sort(arr,Collections.reverseOrder());
	 //print the first K largest element
	 for (int i = 0; i < k; i++) {
		System.out.print(arr[i]+" ");
	}
		
	}


}
