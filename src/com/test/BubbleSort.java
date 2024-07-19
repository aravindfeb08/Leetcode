package com.test;

public class BubbleSort {
	
	public static void bubbleSort(int[] array) {
		boolean swap = true;
		int length = array.length;
		
		while (swap) {
			swap = false;
			int i = 1;
			
			while (i < length) {
				if (array[i-1] > array[i]) {
					int temp = array[i - 1];
					array[i-1] = array[i];
					array[i] = temp;
					swap = true;
				}
				i++;
				
			}
			length--;
		}
	}

}
