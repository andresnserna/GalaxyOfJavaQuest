package finalproj;

import java.io.IOException;

public class CrewMember {
    // Attributes for the CrewMember class
    private String name;           // The name of the crew member
    private int strength;          // Strength stat, likely used for combat or physical tasks
    private int intellegence;      // Intelligence stat, likely used for technical or strategic tasks
    private int agility;           // Agility stat, likely used for speed, dexterity, or evasion
    private int skill;             // Skill stat, could represent proficiency in specific areas
    private int health;            // Health stat, representing the crew member's current health

    // Constructor to initialize the CrewMember object with specific attributes
    public CrewMember(String name, int strength, int intellegence, int agility, int skill, int health) {
        this.setName(name);            // Set the crew member's name
        this.setStrength(strength);    // Set the crew member's strength
        this.setIntellegence(intellegence);  // Set the crew member's intelligence
        this.setAgility(agility);      // Set the crew member's agility
        this.setSkill(skill);          // Set the crew member's skill
        this.setHealth(health);        // Set the crew member's health
    }

    // Getter and setter methods for each attribute
    
    public String getName() {
        return name;  // Return the crew member's name
    }
    public void setName(String name) {
        this.name = name;  // Set the crew member's name
    }

    public int getStrength() {
        return strength;  // Return the crew member's strength
    }
    public void setStrength(int strength) {
        this.strength = strength;  // Set the crew member's strength
    }

    public int getIntellegence() {
        return intellegence;  // Return the crew member's intelligence
    }
    public void setIntellegence(int intellegence) {
        this.intellegence = intellegence;  // Set the crew member's intelligence
    }

    public int getAgility() {
        return agility;  // Return the crew member's agility
    }
    public void setAgility(int agility) {
        this.agility = agility;  // Set the crew member's agility
    }

    public int getSkill() {
        return skill;  // Return the crew member's skill
    }
    public void setSkill(int skill) {
        this.skill = skill;  // Set the crew member's skill
    }

    public int getHealth() {
        return health;  // Return the crew member's health
    }
    public void setHealth(int health) {
        this.health = health;  // Set the crew member's health
    }

    // Method that pauses execution and waits for the user to press ENTER to continue
    public static void pressKey() {
        System.out.println("Press ENTER to continue...");
        try {
            System.in.read();  // Wait for the user to press ENTER
        } catch (IOException e) {
            e.printStackTrace();  // If an error occurs while reading input, print the error stack trace
        }        
    }

    // Override the toString() method to provide a readable summary of the CrewMember's attributes
    @Override
    public String toString() {
        return "Name: " + name + "   Health: " + health + "\n"  // Display name and health
             + "Strength: " + strength + "   Intellegence: " + intellegence + "\n"  // Display strength and intelligence
             + "Agility: " + agility + "   Skill: " + skill + "\n";  // Display agility and skill
    }
}
