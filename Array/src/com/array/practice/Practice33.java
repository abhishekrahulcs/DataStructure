package com.array.practice;


//Move all the negative elements to one side of the array 
public class Practice33 {
	//Drivers code
	public static void main(String[] args) {
		int arr[]= {-1,2,-3,4,5,6,-7,8,9};
		int n=arr.length;
		rearrange(arr,n);
		printArray(arr,n);
     
	}

	private static void rearrange(int[] arr, int n) {
		int j=0,temp;
		for (int i = 0; i < n; i++) {
			if(arr[i]<0) {
				if (i!=j) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
			
		}
		
	}

	private static void printArray(int[] arr, int arr_size) {
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
	}

}
