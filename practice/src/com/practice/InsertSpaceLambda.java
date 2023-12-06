package com.practice;
import java.util.function.Function;

public class InsertSpaceLambda {
    public static void main(String[] args) {
        // Input string
        String inputString = "Capgemini";

        // Lambda expression to insert space after each character
        Function<String, String> insertSpace = s -> s.replaceAll("", " ").trim();

        // Applying the lambda expression to the input string
        String result = insertSpace.apply(inputString);

        // Displaying the result
        System.out.println("Original String: " + inputString);
        System.out.println("String with Space: " + result);
    }
}