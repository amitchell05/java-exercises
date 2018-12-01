package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class SumEven {
    // Write a static method to find the sum of all even numbers in a list
    public static void main(String[] args) {

        // Create a list with at least 10 integers
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNum = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Integer newInt;

        System.out.println("Enter an integer (or enter '0' to finish):");

        do {
            newInt = in.nextInt();

            if (newInt > 0) {
                numbers.add(newInt);
            }

        } while (newInt > 0);


        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNum.add(num);
            }
        }

        int sum = 0;

        for (Integer anEvenNum : evenNum) {
            sum += anEvenNum;
        }

        System.out.println("Sum of list of even numbers: " + sum);
    }
}