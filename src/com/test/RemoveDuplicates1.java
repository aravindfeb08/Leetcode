package com.test;
public class RemoveDuplicates1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};

        System.out.println("Original array:");
        printArray(array);

        // Remove duplicates
        removeDuplicates(array);

        System.out.println("\nArray after removing duplicates:");
        printArray(array);
    }

    private static void removeDuplicates(int[] arr) {
        int length = arr.length;

        // Iterate through the array
        for (int i = 0; i < length; i++) {
            // Check for duplicates
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    // Shift elements to the left to overwrite the duplicate
                    for (int k = j; k < length - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    // Decrease the length of the array since we removed a duplicate
                    length--;
                    // Decrement j to recheck the current index after shifting
                    j--;
                }
            }
        }
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

/*
 * Complexity Analysis:
 * 
 * Time Complexity: O(n^2) - The nested loop iterates through the array, and for
 * each element, it checks for duplicates in the remaining part of the array.
 * This results in a time complexity of O(n^2), where 'n' is the length of the
 * array.
 * 
 * Space Complexity: O(1) - The algorithm performs the removal in-place without
 * using any additional data structures, so the space complexity is constant.
 */