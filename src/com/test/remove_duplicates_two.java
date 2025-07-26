package com.test;
import java.util.Arrays;

public class remove_duplicates_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// { 3, 7, 2, 0, 5, 0, 8, 0 }
		int[] array = { 3, 7, 2, 3, 5, 7, 8, 2 };
		int zeroCount = 0;
		
		//int a,b,c;
				
		//int d =0,  f = 0, k= 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] != 0 && array[i] == array[j]) {
					array[j] = 0;
					zeroCount++;
				}
			}
		}
		
		System.out.println("zeroCount = "+zeroCount);

		int finalLenght = array.length - zeroCount;
		System.out.println("finalLenght = "+finalLenght);
		int[] output = new int[finalLenght];

		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] == 0) {
				continue;
			}
			output[j] = array[i];
			j++;
		}
		
		Arrays.stream(output).forEach(System.out::println);

	}

}
