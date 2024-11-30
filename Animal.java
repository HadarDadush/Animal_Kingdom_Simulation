// This class represents a generic animal with properties like name, age, color, and owner details.
// It also defines abstract methods for eating and sleeping, to be implemented by subclasses.
// It implements the Cloneable interface for cloning animals.

public abstract class Animal implements Cloneable {
    protected String name;
    protected int age;
    protected String color;
    protected String ownerName;
    protected String ownerPhone;

    // Constructor
    public Animal(String name, int age, String color, String ownerName, String ownerPhone) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
    }

    // Abstract methods
    public abstract void eat();
    public abstract void sleep();

    // Method to display animal info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Color: " + color + ""
        + ", Owner: " + ownerName + " (Phone: " + ownerPhone + ")");
        
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    // Method to clone the animal
    @Override
    public Object clone() {
        try {
            Animal cloned = (Animal) super.clone();
            cloned.ownerName = new String(this.ownerName);
            cloned.ownerPhone = new String(this.ownerPhone);
            return cloned;
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported for this animal.");
            return null;
        }
    }

    // toString method for Animal
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Color: " + color + ", Owner: " + ownerName + " (Phone: " + ownerPhone + ")";
    }

    // equals method for Animal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Animal animal = (Animal) obj;
        return age == animal.age &&
               name.equals(animal.name) &&
               color.equals(animal.color) &&
               ownerName.equals(animal.ownerName) &&
               ownerPhone.equals(animal.ownerPhone);
    }
}
