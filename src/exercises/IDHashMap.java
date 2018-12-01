package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IDHashMap {

    public static void main(String[] args) {

        // Make a program that takes in students names and ID numbers (as integers) instead of names and grades
        // Keys should be integers (IDs); Values should be strings (names)

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int newStudentID;

        System.out.println("Enter your students (or enter '0' to finish):");

        // Get student id and names
        do {

            System.out.print("Student ID: ");
            newStudentID = in.nextInt();

            if (newStudentID > 0) {
                System.out.print("Student name: ");
                String newStudentName = in.next();
                students.put(newStudentID, newStudentName);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while (newStudentID > 0);

        System.out.println("\nClass roster:");

        // Modify the roster printing

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }

    }

}

