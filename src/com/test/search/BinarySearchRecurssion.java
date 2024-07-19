package com.test.search;

public class BinarySearchRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40, 60 };
		int target = 10;
		int result = binarySearch(arr, arr.length -1, 0, target);
		System.out.println("result = "+result);

	}
	
	public static int binarySearch(int[] arr, int high, int low, int target) {
		int itr = 1;
					
			if (arr.length > 0 && low <= high) {
				
				int mid = low + (high - low)/2;
				System.out.println("Iteration = "+itr);
				System.out.println("low = "+low+", high = "+high+", mid = "+mid);
				System.out.println("low = "+arr[low]+", high = "+arr[high]+", mid = "+arr[mid]);
				System.out.println();
				
				if (arr[mid] == target)
					return mid;
				
				if (arr[mid]  > target) {
					return binarySearch(arr, mid -1, low, target);
				}
				
				if (arr[mid] < target) {
					return binarySearch(arr, high, mid + 1, target);
				}
					
			}
			
			return -1;

	}


}
