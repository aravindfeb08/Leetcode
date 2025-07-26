package com.test.utils;

public class ArrayUtils {

	public static void printArrayInt(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}
