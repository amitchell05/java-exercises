package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class FiveLetterWords {
    // Write a static method to print out each word in a list that has exactly 5 letters
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String newWord;

        System.out.println("Enter a word (or ENTER to finish):");

        do {
            newWord = in.nextLine();

            if (!newWord.equals("")) {
                words.add(newWord);
            }

        } while (!newWord.equals(""));

        for (String word : words) {
            if (word.length() == 5) {
                fiveLetterWords.add(word);
            }
        }

        System.out.println(fiveLetterWords);

        System.out.println("\nList of five-letter words:");

        for (String fiveLetterWord : fiveLetterWords) {
            System.out.println(fiveLetterWord);
        }

    }
}
