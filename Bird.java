// The Bird class extends Animal and provides specific implementations for the eat and sleep methods.
// It also adds a unique method for flying. 
// The toString method is overridden to specify it's a Bird.

public class Bird extends Animal {

    public Bird(String name, int age, String color, String ownerName, String ownerPhone) {
        super(name, age, color, ownerName, ownerPhone);
    }

    // Implementing eat method
    @Override
    public void eat() {
        System.out.println("I eat seeds or insects.");
    }

    // Implementing sleep method
    @Override
    public void sleep() {
        System.out.println("I sleep in a nest.");
    }

    // Specific behavior for Bird
    public void fly() {
        System.out.println("I can fly.");
    }

    // toString method for Bird
    @Override
    public String toString() {
        return super.toString() + " (Bird)";
    }
}
