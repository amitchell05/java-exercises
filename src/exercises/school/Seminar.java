package exercises.school;

public class Seminar {

    public static void main(String[] args) {
        // Constructors
        // Overriding - same class name
        Student shawn = new Student();
        Student cindy = new Student("Cindy", 634421, 16, 4.0);
        Student max1 = new Student("Max", 738495, 50, 3.8);
        Student max2 = new Student("Maxine", 738495, 50, 3.8);

        Object major = Student.MAJOR;

        shawn.setName("Shawn");
        System.out.println(shawn.getName());

        shawn.addGrade(3, 4.0);
        shawn.addGrade(4, 3.0);

        System.out.println(shawn.getGpa());

        System.out.println(shawn.getNumberOfCredits());

        System.out.println(shawn.getGradeLevel(shawn.getNumberOfCredits()));

        // overrider equals instance method
        System.out.println(shawn.equals(cindy));
        System.out.println(shawn.equals(shawn));
        System.out.println(max1.equals(max2));

        // override toString instance method
        System.out.println(shawn.toString());



    }
}
