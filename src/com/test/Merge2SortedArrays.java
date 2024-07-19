package com.test;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] first = {1, 3, 5, 7};
        int[] second = {2, 4, 6, 8};
        
        int[] third = mergeArray(first, second);
        
        PrintArray.printArray(third);
	}

	public static int[] mergeArray(int[] first, int[] second) {
		int firstLenght = first.length;
		int secondLenght = second.length;
		int finalLenght = firstLenght + second.length;
		int[] third = new int[finalLenght];
		
		int i = 0, j = 0, k = 0;
		
		while (i < firstLenght && j < secondLenght) {
			if (first[i] <= second[j]) {
				third[k] = first[i];
				i++;
			} else {
				third[k] = second[j];
				j++;
			}
			k++;
		}
		
		while(i < firstLenght) {
			third[k] = first[i];
			i++;
			k++;
		}
		
		while(j < secondLenght) {
			third[k] = second[j];
			j++;
			k++;
		}
				
		return third;
	}
}
