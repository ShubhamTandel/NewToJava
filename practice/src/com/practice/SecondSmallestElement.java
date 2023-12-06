package com.practice;
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input: Array elements
        System.out.print("Enter " + size + " elements for the array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the second smallest element
        int secondSmallest = findSecondSmallest(array);

        // Display the result
        System.out.println("Second Smallest Element: " + secondSmallest);

        // Close the scanner
        scanner.close();
    }

    // Function to find the second smallest element in an array
    private static int findSecondSmallest(int[] array) {
        // Check if the array has at least two elements
        if (array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return Integer.MIN_VALUE; // Indicates an error condition
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // The second smallest element will be at index 1
        return array[1];
    }
}