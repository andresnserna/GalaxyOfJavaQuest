package finalproj;

import java.util.List;
import java.util.Random;

public class Engineer extends CrewMember implements CrewMemberAction {
    
    // Constructor to initialize the Engineer object with specific attributes
    public Engineer(String name, int strength, int intellegence, int agility, int skill, int health) {
        super(name, strength, intellegence, agility, skill, health);  // Call the parent constructor to initialize CrewMember attributes
        // TODO Auto-generated constructor stub
    }

    // Action method where the engineer can repair the ship's hull
    @Override
    public void action(List<CrewMember> crew, Starship ship, List<Planet> solarSystem, int locationIndex) {
        // The engineer can repair the ship's hull and improve its condition
        System.out.println("The ship looks pretty damaged, let me see what i can do");
        System.out.println("*" + this.getName() + " repairs the hull of your ship +10*");        
        
        // Increase the ship's hull integrity by 10 points
        ship.setHullIntegrity(ship.getHullIntegrity() + 10);
    }

    // Method to handle fighting, where the engineer participates in combat
    @Override
    public void fight(List<CrewMember> crew, Alien alien) {
        // The engineer expresses doubt about their fighting ability
        System.out.println(this.getName() + ": \"I'm only an engineer, I don't know how to fight!\"");
        
        // Create a new Random object to simulate randomness in combat
        Random dice = new Random();
        
        // Combat loop, where the engineer and alien take turns attacking each other
        while ((alien.getHealth() > 0) && (this.getHealth() > 0)) {
            // Engineer's turn to attack
            int attkPwr = this.getStrength() - (dice.nextInt(10) + 1);  // Calculate the damage dealt by the engineer
            alien.setHealth(alien.getHealth() - attkPwr);  // Reduce the alien's health by the damage dealt
            System.out.println(this.getName() + " deals " + attkPwr + " damage to the " + alien.getName());
            
            // Check if the alien is dead after the engineer's attack
            if (alien.getHealth() <= 0) {
                System.out.println(alien.getName() + " is dead! phew...");
                break;  // Exit the loop if the alien is defeated
            }
            
            // Alien's turn to attack
            this.setHealth(this.getHealth() - alien.getStrength());  // Reduce the engineer's health based on alien's strength
            System.out.println(this.getName() + " takes " + alien.getStrength() + " damage from " + alien.getName());
            
            // Check if the engineer is dead after the alien's attack
            if (this.getHealth() <= 0) {
                System.out.println("Oh no oh dear God, " + this.getName() + " has been killed...");
                System.out.println("The scientist jumps in to fight!");  // If the engineer dies, another crew member joins the fight
                ((Scientist) crew.get(3)).fight(crew, alien);  // Let the scientist take over the fight
                break;  // Exit the loop if the engineer dies
            }
            
            // Wait for user input before continuing the fight
            pressKey();
        }        
    }

    // Catchphrase method to display the engineer's catchphrase
    @Override
    public void catchPhrase() {
        // The engineer makes a humorous catchphrase
        System.out.println(this.getName() + ": \"You think that's bad? At least it's not rocket science HAAAAAAAAA!\"");
    }
}
