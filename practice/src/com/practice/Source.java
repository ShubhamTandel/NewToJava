package com.practice;
import java.util.*;

public class Source {
    private int[] arr;

    public Source(int[] arr) {
        this.arr = arr;
    }

    public int getSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return -1;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] exampleArray = {23, 45, 32, 22, 20, 96};
        Source Ar = new Source(exampleArray);
        int secondSmallest = Ar.getSecondSmallest(exampleArray); // Pass the array as an argument
        System.out.println(secondSmallest);
    }
}
