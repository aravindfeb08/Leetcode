package com.test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[5];
		int[] anotherArray = {1, 2, 3, 4, 5};
		array = anotherArray;
		
		System.out.print("{");
		for (int i:array) {
			System.out.print(i+", ");
		}
		System.out.print("}");
		
		
		
		array = new int[5];
		//array = anotherArray;
		
		System.out.print("{");
		for (int i:array) {
			System.out.print(i+", ");
		}
		System.out.print("}");
		
		array = new int[8];
		
		
		
		System.out.print("{");
		for (int i:array) {
			System.out.print(i+", ");
		}
		System.out.print("}");

	}

}
