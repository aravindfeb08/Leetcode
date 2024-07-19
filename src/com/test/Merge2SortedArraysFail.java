package com.test;

import java.util.Arrays;

public class Merge2SortedArraysFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2, 5 };
		int[] nums3 = { 2, 5, 9, 3, 1, 10, 4 };
		//findMedianSortedArrays(nums1, nums2);
		Arrays.sort(nums3);

	}
	
	public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
		System.out.println("lenght of nums1: "+nums1.length);
		System.out.println("lenght of nums2: "+nums2.length);
		
		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums1.length; j++) {
				if (nums2[i] >= nums1[j]) {
					int temp[] = new int[nums1.length + 1];
					for (int k = 0; k < nums1.length; k++) {
						if (k == j) {
							temp[k] = nums1[k];
							temp[++k] = nums2[i];
							continue;
						}
						temp[k] = nums1[k];
					}
					nums1 = new int[temp.length];
					nums1 = temp;
					break;
				}
			}
		}
		
		System.out.println("-----Result------");
		for (int i = 0; i < nums2.length; i++) {
			if(i == nums2.length -1)
				System.out.print(nums2[i]);
			else
				System.out.print(nums2[i] + ", ");

		}

	}

}
