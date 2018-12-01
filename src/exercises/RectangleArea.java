package exercises;

import java.util.Scanner;

public class RectangleArea {
    // Write a program to calculate and print the area of a rectangle
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the length of your rectangle: ");
        width = in.nextDouble();
        System.out.println("Enter the width of your rectangle: ");
        length = in.nextDouble();

        area = length * width;
        System.out.println("The area of your rectangle: " + area);
    }
}
