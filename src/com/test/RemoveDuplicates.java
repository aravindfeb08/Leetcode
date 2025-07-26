package com.test;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 8, 2, 100, 3, 4, 4, 4, 5, 8, 10 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		
// 		array[array.length + 1] = 6;
//		array = new int[5];
//
		removeDulplicate(array);

	}

	public static void removeDulplicate(int[] array) {

		int[] finalArray = new int[] { array[0] };

		for (int i = 1; i < array.length; i++) {
			boolean unique = true;
			for (int j = 0; j < finalArray.length; j++) {
				if (array[i] == finalArray[j]) {
					unique = false;
					break;
				}
			}
			
			if(unique) {
				int[] tmpArray = new int[finalArray.length +1];
				
				for (int k = 0; k < finalArray.length; k++) {
					tmpArray[k] = finalArray[k];
				}
								
				tmpArray[finalArray.length] = array[i];
				finalArray = tmpArray;
			}
		}
		
		for (int i = 0; i < finalArray.length; i++) {
			System.out.print(finalArray[i] + " ");
		}

	}

}
