package finalproj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SecurityOfficer extends CrewMember implements CrewMemberAction { //deomnstrates inheritance by extending the class signiture to include the super class
												// use the crewMemberActionInterface to have a blueprint of method necessary for function
	Random dice;
	//demonstrates encapsulation and field scope

	public SecurityOfficer(String name, int strength, int intellegence, int agility, int skill, int health) {
		super(name, strength, intellegence, agility, skill, health);		//deomnstrates inheritance by invoking the constructor of its superclass
		this.dice = new Random();
	}

	@Override
	public void action(List<CrewMember> crew, Starship ship, List<Planet> solarSystem, int locationIndex) {
		// The security officer is the role on the ship that fights aliens, 
		// so the "scan for aliens" option for our game will be SecurityOfficer.action()
		
		if((dice.nextInt(10) + 1) == 10) {
			// encounter alien
			System.out.println(this.getName() + ": \"I found an alien!!\"");
			fight(crew, null); 
			
		} else {
			System.out.println(this.getName() + " didn't find any aliens... but keep an eye out for anything suspicious.");
		}
	}

	@Override
	public void fight(List<CrewMember> crew, Alien alien) {
		alien = new Alien("Demigorgan", "A sleek, metallic-skinned being with elongated limbs and glowing, crystalline eyes that shift color with their emotions. Their heads are adorned with bioluminescent tendrils that pulse faintly like a living neural network.", 50, "Xaldorian", 15);
		// do we create a new alien or somehow find a way to pass in 
		// the alien that killed SecurityOfficer into this method...
		
		while((alien.getHealth() > 0) && (this.getHealth() > 0)) {
				
			//SecurityOfficer turn
				int attkPwr = this.getStrength() - (dice.nextInt(10) + 1);
				alien.setHealth(alien.getHealth() - attkPwr);
				System.out.println(this.getName() + " deals " + attkPwr + " damage to the " + alien.getName());
				
				if (alien.getHealth() <= 0) {
	                System.out.println(alien.getName() + " is dead! phew...");
	    			System.out.println(crew.get(3).getName() + ": \"That was a " + alien.getName() + ", " + alien.getDescription() + "\"");

	                
	                break;
	            }
				
			//Alien turn
				this.setHealth(this.getHealth() - alien.getStrength());
				System.out.println(this.getName() + " takes " + alien.getStrength() + " damage from " + alien.getName());
				
				if (this.getHealth() <= 0) {
	                System.out.println("Oh no oh dear God, " + this.getName() + " has been killed...");
	                System.out.println("The capitan jumps in to fight!");
	                ((Capitan) crew.get(1)).fight(crew, alien);
	                break;
	            }
				
				pressKey();
			
		}
	}

	@Override
	public void catchPhrase() {
        System.out.println(this.getName() + ": \"All I know is beer, bacon, back rubs and safety\"");
	}

}
