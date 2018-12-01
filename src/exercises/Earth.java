package exercises;

public class Earth {
    public static void main(String args[]) {

        Human human1 = new Human("Tom", 25, 76, "blue");
        Human human2 = new Human("Joe", 28, 68, "green");

        human1.speak();
        human2.speak();

//        // tom => instance variable - points to the actual object
//        Human tom;
//        // creates the object
//        tom = new Human();
//
//        tom.age = 5;
//        tom.eyeColor = "brown";
//        tom.heightInInches = 72;
//        tom.name = "Tom Zsabo";
//
//        tom.speak();
//
//        Human joe = new Human();
//
//        joe.age = 30;
//        joe.eyeColor = "blue";
//        joe.heightInInches = 70;
//        joe.name = "Joe Brown";
//
//        joe.speak();

    }

}
