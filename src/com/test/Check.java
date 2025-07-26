package com.test;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10 % 2;
		System.out.println("printf = " + i);

		int j = 123;
		
		int f = j % 10;
		
		System.out.println("value of f = " + f);

		int k = 0;
		
		int reversed = 0;

		while (j != 0) {

			k = j % 10;
			reversed = reversed * 10 + k;
			j = j/10;
			System.out.println("value of k = " + k+ ", rev = "+reversed+", j = "+j);
		}
		
		System.out.println("reversed = "+reversed);

	}

}
