package com.test.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40, 60 };
		int target = 4;
		int result = binarySearch(arr, target);
		System.out.println("result = "+result);
	}
	
	public static int binarySearch(int[] arr, int target) {
		int itr = 1;
		
		if (arr.length > 0) {
			int low = 0;
			int high = arr.length -1;
			
			
			while (low <= high) {
				
				int mid = low + (high - low)/2;
				System.out.println("Iteration = "+itr);
				System.out.println("low = "+low+", high = "+high+", mid = "+mid);
				System.out.println();
				
				if (arr[mid] == target)
					return mid;
				
				if (arr[mid]  > target) {
					high = mid -1;
				}
				
				if (arr[mid] < target) {
					low = mid + 1;
				}
					
			}
			
		}
		
		return -1;
	}

}
