// The Mammal class extends Animal and provides specific implementations for the eat and sleep methods.
// It also adds a unique method for hibernating.
// The toString method is overridden to specify it's a Mammal.


public class Mammal extends Animal {

    public Mammal(String name, int age, String color, String ownerName, String ownerPhone) {
        super(name, age, color, ownerName, ownerPhone);
    }

    // Implementing eat method
    @Override
    public void eat() {
        System.out.println("I eat meat or plants.");
    }

    // Implementing sleep method
    @Override
    public void sleep() {
        System.out.println("I sleep at night.");
    }

    // Specific behavior for Mammal
    public void hibernate() {
        System.out.println("I can hibernate in winter.");
    }

    // toString method for Mammal
    @Override
    public String toString() {
        return super.toString() + " (Mammal)";
    }
}
