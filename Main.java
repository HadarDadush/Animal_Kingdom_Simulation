// This is the main class where animals are created and their behaviors are tested.
// It demonstrates cloning, polymorphism, and specific behaviors of Mammal, Bird, and Reptile.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	
        // Creating the animals
        Animal rabbit = new Mammal("Rabbit", 2, "White", "John Doe", "123-456-7890");
        Animal parrot = new Bird("Parrot", 2, "Green", "Alice Smith", "555-555-5555");
        Animal turtle = new Reptile("Turtle", 100, "Green", "Jane Doe", "987-654-3210");

        // Printing animal details
        System.out.println();
        System.out.println("------ Animal Details ------\n");

        rabbit.displayInfo();
        rabbit.eat();
        rabbit.sleep();
        
        // Specific to Mammal
        ((Mammal) rabbit).hibernate();
        System.out.println();

        parrot.displayInfo();
        parrot.eat();
        parrot.sleep();
        
        // Specific to Bird
        ((Bird) parrot).fly();
        System.out.println();

        turtle.displayInfo();
        turtle.eat();
        turtle.sleep();
        
        // Specific to Reptile
        ((Reptile) turtle).crawl();
        System.out.println();
        System.out.println("-------------------------------------------------------------------");  // Divider line

        // Cloning example
        System.out.println("\n--- Cloning Example ---\n");
        Animal clonedRabbit = (Animal) rabbit.clone();
        Animal clonedParrot = (Animal) parrot.clone();
        Animal clonedTurtle = (Animal) turtle.clone();

        // Printing the cloned animals
        System.out.println("Original: ");
        rabbit.displayInfo();
        System.out.println("Cloned: ");
        clonedRabbit.displayInfo();
        System.out.println();

        System.out.println("Original: ");
        parrot.displayInfo();
        System.out.println("Cloned: ");
        clonedParrot.displayInfo();
        System.out.println();

        System.out.println("Original: ");
        turtle.displayInfo();
        System.out.println("Cloned: ");
        clonedTurtle.displayInfo();
        System.out.println();
        System.out.println("-------------------------------------------------------------------");  // Divider line

        // Polymorphism example
        System.out.println("\n--- Polymorphism Example ---\n");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(rabbit);
        animals.add(parrot);
        animals.add(turtle);

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.eat();
            animal.sleep();
            if (animal instanceof Mammal) {
                ((Mammal) animal).hibernate();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            } else if (animal instanceof Reptile) {
                ((Reptile) animal).crawl();
            }
            System.out.println();
        }

        // Changing the owner of the cloned rabbit
        clonedRabbit.setOwnerName("New Owner");
        clonedRabbit.setOwnerPhone("111-222-3333");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\nAfter Changing Owner of Cloned Rabbit:\n");
        System.out.println("Original: ");
        rabbit.displayInfo();
        System.out.println("Cloned: ");
        clonedRabbit.displayInfo();
        System.out.println();
        System.out.println("-------------------------------------------------------------------");  // Divider line after the update
    }
}
