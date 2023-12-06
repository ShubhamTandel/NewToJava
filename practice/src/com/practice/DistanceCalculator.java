package com.practice;
import java.util.Scanner;
public class DistanceCalculator {
    public static void main(String[] args) {
        // Constants
        double initialVelocityKmPerH = 36.0; // Initial velocity in km/h
        double accelerationMPerS2 = 5.0; // Acceleration in m/s^2

        // Convert initial velocity to m/s
        double initialVelocityMPerS = initialVelocityKmPerH * 1000 / 3600;

        // Input: Time interval in seconds
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time interval in seconds: ");
        double timeInterval = scanner.nextDouble();
        double timeInterval1 = scanner.nextDouble();

        // Calculate distance using the kinematic equation
        double distance = calculateDistance(initialVelocityMPerS, accelerationMPerS2, timeInterval);
        double distance1 = calculateDistance(initialVelocityMPerS, accelerationMPerS2, timeInterval1);
        // Display the result
        System.out.println("Distance traveled in " + timeInterval + " seconds: " + distance + " meters");
        System.out.println("Distance traveled in " + timeInterval1 + " seconds: " + distance1 + " meter");

        // Close the scanner
        scanner.close();
    }

    // Function to calculate distance using the kinematic equation
    private static double calculateDistance(double initialVelocity, double acceleration, double time) {
        return initialVelocity * time + 0.5 * acceleration * Math.pow(time, 2);
    }
}