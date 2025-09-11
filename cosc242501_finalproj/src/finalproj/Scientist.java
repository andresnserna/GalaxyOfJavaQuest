package finalproj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scientist extends CrewMember implements CrewMemberAction { //deomnstrates inheritance by extending the class signiture to include the super class
											// use the crewMemberActionInterface to have a blueprint of method necessary for function
	private int refuelCount = 3;
	//demonstrates encapsulation and field scope
	
	public Scientist(String name, int strength, int intellegence, int agility, int skill, int health) {
		super(name, strength, intellegence, agility, skill, health); //deomnstrates inheritance by invoking the constructor of its superclass
	}
	
	public int getRefuelCount() {
		return refuelCount;
	}

	@Override   // use the crewMemberActionInterface to have a blueprint of method necessary for function
	public void action(List<CrewMember> crew, Starship ship, List<Planet> solarSystem, int locationIndex) {
		// the scientist can refuel the ship and be a big ol' nerd. but only refuel it 3 times.
		refuelCount--;
		
		if (refuelCount <= 0) {
			System.out.println(this.getName() + ": \"We're out of chemicals for me to reconstitute some fuel in, I'm sorry :(\"");
		} else {
			System.out.println("If I isolote the diatoms from the subatomic thermoenhancer... I can refuel our ship!");
			System.out.println("*" + this.getName() + " refuels the ship a little bit*");		
			
			ship.setFuelLevel(ship.getFuelLevel() + 10);
		}
	}

	@Override
	public void fight(List<CrewMember> crew, Alien alien) {
		System.out.println(this.getName() + ": \"I'm just a scientist, I'd never hurt a fly!\"");
		
		//Alien alien = new Alien("Demigorgan", "A sleek, metallic-skinned being with elongated limbs and glowing, crystalline eyes that shift color with their emotions. Their heads are adorned with bioluminescent tendrils that pulse faintly like a living neural network.", 50, "Xaldorian", 15);
		Random dice = new Random();
		// do we create a new alien or somehow find a way to pass in 
		// the alien that killed SecurityOfficer into this method...
		
		while((alien.getHealth() > 0) && (this.getHealth() > 0)) {
			//fight logic here
				
				//Scientist's turn
				int attkPwr = this.getStrength() - (dice.nextInt(10) + 1);
				alien.setHealth(alien.getHealth() - attkPwr);
				System.out.println(this.getName() + " deals " + attkPwr + " damage to the " + alien.getName());
				
				if (alien.getHealth() <= 0) {
	                System.out.println(alien.getName() + " is dead! phew...");
	                break;
	            }
				
				//Alien turn
				this.setHealth(this.getHealth() - alien.getStrength());
				System.out.println(this.getName() + " takes " + alien.getStrength() + " damage from " + alien.getName());
				
				if (this.getHealth() <= 0) {
	                System.out.println("Oh no oh dear God, " + this.getName() + " has been killed...");
	                System.out.println("The " + alien.getName() + " retreats in victory");
	                break;
	            }
				
				pressKey();
		}				
	}

	@Override
	public void catchPhrase() {		
        System.out.println(this.getName() + ": \"Am I a Trekkie? What even is that? I've never heard of such a species.\"");
	}


}
