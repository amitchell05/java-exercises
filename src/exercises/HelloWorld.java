package exercises;

import java.util.Scanner;

public class HelloWorld {
    // Prompt the user for their name, and greet them by name
    public static void main(String[] args) {
        String name;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = in.next();

        System.out.println("Hello, " + name);
    }
}
