// This class represents an animal's owner with name and phone details.
// It has methods to get owner information and check equality based on name and phone.

public class Owner {
    private String name;
    private String phone;

    // Constructor
    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    // toString method for Owner
    @Override
    public String toString() {
        return name + " (Phone: " + phone + ")";
    }

    // equals method for Owner
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Owner owner = (Owner) obj;
        return name.equals(owner.name) && phone.equals(owner.phone);
    }
}
