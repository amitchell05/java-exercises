package exercises;

public class Animal {
    String name;
    int age;
    String gender;
    double weightInPounds;

    public Animal(String name, int age, String gender, double weightInPounds) {
        // Generate (right-click; generate) or Alt + Insert
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
    }

    public void qualities() {
        System.out.println("Animal: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weightInPounds + " pound(s)");
    }

    public void eat() {
        System.out.println("The " + name + " is eating...");
    }

    public void sleep() {
        System.out.println("The " + name + " is sleeping...");
    }


}
