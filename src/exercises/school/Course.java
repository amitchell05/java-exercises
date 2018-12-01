package exercises.school;

import java.util.HashMap;

public class Course {
//    HashMap<String, Integer> course = new HashMap<>();
//    String description;

    public static void main(String[] args) {
        Student max1 = new Student("Max", 738495, 50, 3.8);
        Student max2 = new Student("Maxine", 738495, 50, 3.8);

        if (max1.equals(max2)) {
            System.out.println(max1.getName() + " is the same as " + max2.getName());
        }
    }


}
