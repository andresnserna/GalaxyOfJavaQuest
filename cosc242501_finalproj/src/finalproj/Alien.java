package finalproj;

public class Alien extends SpaceEntity {
    
    // Instance variables to store health and strength of the alien
    private int health;
    private int strength;
    
    // Constructor to initialize the Alien object with name, description, health, species, and strength
    public Alien(String name, String description, int health, String species, int strength) {
        super(name, description); // Call the parent class constructor to set name and description
        this.setHealth(health);   // Set the health of the alien
        this.setStrength(strength); // Set the strength of the alien
    }

    // Getter for health
    public int getHealth() {
        return health;  // Returns the current health of the alien
    }

    // Setter for health
    public void setHealth(int health) {
        this.health = health;  // Sets the health of the alien
    }

    // Getter for strength
    public int getStrength() {
        return strength;  // Returns the current strength of the alien
    }

    // Setter for strength
    public void setStrength(int strength) {
        this.strength = strength;  // Sets the strength of the alien
    }
    
}
