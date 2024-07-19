package com.test;

public class PrintArray {
	
	public static void printArray(int[] nums4) {
		// TODO Auto-generated method stub
		int i = 0;
		int length = nums4.length;
		System.out.print("{ ");
		while(i < length) {
			System.out.print(nums4[i]);
			if(i < length - 1)
				System.out.print(", ");
			i++;
		}
		System.out.println(" }");
	}

}
