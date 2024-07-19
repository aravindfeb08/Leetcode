package com.test;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// input
		int[] nums3 = { 2, 5, 9, 3, 1, 10, 4 };
		int[] nums2 = {5, 3, 8, 4, 2};
		PrintArray.printArray(nums3);
		
		//InsertionSort.insertionSort(nums3);
		
		//BubbleSort.bubbleSort(nums3);
		SelectionSort.selectionSort(nums3);
		
		//output
		PrintArray.printArray(nums3);
	}

}
