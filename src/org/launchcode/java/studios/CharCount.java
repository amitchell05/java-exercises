package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {
        //String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = in.nextLine();

        char[] charactersInString = text.toLowerCase().toCharArray();
        HashMap<Character, Integer> characters = new HashMap<>();
        // int counter = 0;

        for (char character: charactersInString) {
            if (characters.containsKey(character)) {
                /* counter += 1;
                characters.computeIfPresent(character, (k, v) -> v + 1);*/
                characters.put(character, characters.get(character) + 1);
            } else if (!(characters.containsKey(character)) && Character.isLetter(character)) {
                // counter = 1;
                characters.put(character, 1);
            }

        }

        for (Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }

}
