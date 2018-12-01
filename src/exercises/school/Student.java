package exercises.school;

public class Student {

    public static Object MAJOR = "Computer Science";
    private static String collegeName = "Washington University";
    private final Double creditsRequired = 60.0;

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student() {
    }

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        // Do this
        this(name, studentId, 0, 0.0);

//        // Or this
//        this.name = name;
//        this.studentId = studentId;
//        this.numberOfCredits = 0;
//        this.gpa = 0.0;
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double qualityScore = gpa * numberOfCredits;
        numberOfCredits += courseCredits;
        double totalQualityScore = qualityScore + (grade * courseCredits);
        gpa = totalQualityScore / numberOfCredits;

    }

    public String getGradeLevel(int numberOfCredits) {
        // Determine the grade level of the student based on numberOfCredits;
        if (numberOfCredits < 30) {
            return "Freshman";
        } else if (numberOfCredits < 60) {
            return "Sophomore";
        } else if (numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
