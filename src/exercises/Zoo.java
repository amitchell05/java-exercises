package exercises;

public class Zoo {
    public static void main(String args[]) {
        Animal animal1 = new Animal("lion", 7, "Male", 100.0);
        Animal animal2 = new Animal("elephant", 15, "Female", 600.0);
        Animal animal3 = new Animal("bear", 4, "Male", 20.0);

        Bird bird1 = new Bird();

        Fish fish1 = new Fish();

        animal1.qualities();
        animal2.qualities();
        animal3.qualities();

        animal3.eat();
        animal1.sleep();

        bird1.fly();
        fish1.swim();

    }
}
