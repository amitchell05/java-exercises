package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
//        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
//
//        String searchTerm = "alice";
//
//        if (text.contains(searchTerm)) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }

        // Store sentence in a string
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String search;
        boolean search_result;

        // Prompt user for a term to search for within the string
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a term to search for: ");
        search = in.next();

        // Print whether or not the search was found, making it case-insensitive
        search_result = text.toLowerCase().contains(search.toLowerCase());
        System.out.println(search_result);

    }
}
