package exercises.cats;

public class Cat {

    private boolean tired = false;
    private boolean hungry = false;
    private double weight;

    public static void main(String args[]) {
        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());
        System.out.println(((HouseCat) suki).isSatisfied());

        Cat plainCat = new Cat(8.6);
        HouseCat garfield = new HouseCat("Garfield", 12);

        garfield.sleep();
        garfield.eat();

        System.out.println(plainCat.noise());
        System.out.println(garfield.noise());

//        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isHungry());

    }

    //The biological Family for all cat species
    private String family = "Felidae";

    public Cat (double aWeight) {
        weight = aWeight;
    }

    /***** Getters and Setters *****/

    public boolean isTired() {
        return tired;
    }

    public void setTired(boolean aTired) {
        tired = aTired;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean aHungry) {
        hungry = aHungry;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double aWeight) {
        weight = aWeight;
    }

    public String getFamily() {
        return family;
    }

    /***** Instance Methods *****/

    // A cat is rested and hungry after it sleeps

    public void sleep() {
        tired = false;
        hungry = true;
    }

    // Eating makes a cat not hungry
    public void eat() {
        // Eating when not hungry makes a cat sleepy
        if (!hungry) {
            tired = true;
        }

        hungry = false;
    }
    public String noise() {
        return "Meeeeeeoooowww!";
    }

}
