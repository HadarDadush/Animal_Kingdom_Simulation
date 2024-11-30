// The Reptile class extends Animal and provides specific implementations for the eat and sleep methods.
// It also adds a unique method for crawling.
// The toString method is overridden to specify it's a Reptile.

public class Reptile extends Animal {

    public Reptile(String name, int age, String color, String ownerName, String ownerPhone) {
        super(name, age, color, ownerName, ownerPhone);
    }

    // Implementing eat method
    @Override
    public void eat() {
        System.out.println("I eat plants or small animals.");
    }

    // Implementing sleep method
    @Override
    public void sleep() {
        System.out.println("I sleep in my shell.");
    }

    // Specific behavior for Reptile
    public void crawl() {
        System.out.println("I crawl slowly.");
    }

    // toString method for Reptile
    @Override
    public String toString() {
        return super.toString() + " (Reptile)";
    }
}
