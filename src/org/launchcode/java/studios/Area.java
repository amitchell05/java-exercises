package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius = 0.0;
        double area = 0.0;

        //create a scanner to receive input
        Scanner in = new Scanner(System.in);

        while (radius <= 0) {
            // ask user to enter a radius
            System.out.println("Enter a radius: ");
            radius = in.nextDouble();

            // if radius is negative return an error message
            if (radius < 0) {
                System.out.println("Invalid radius. Try again.");
                radius = 0.0;
                continue;
            }

            // calculate area of a circle
            area = 3.14 * radius * radius;

        }

        // print return statement
        System.out.println("The area of a circle with a radius " + radius + " is: " + area);

    }

}
