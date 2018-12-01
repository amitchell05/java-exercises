package exercises;

import java.util.Scanner;

public class MPG {
    // Ask user for number of miles driven and amount of gas consumed; print their MPG
    public static void main(String[] args) {
        double miles;
        double consumed_gas;
        double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the number of miles you've driven: ");
        miles = in.nextDouble();
        System.out.println("Enter the amount of gas consumed (in gallons): ");
        consumed_gas = in.nextDouble();

        mpg = miles / consumed_gas;
        System.out.println("Your MPG: " + mpg + " MPG");
    }
}
