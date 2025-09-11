package finalproj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Capitan extends CrewMember implements CrewMemberAction {
	Random dice = new Random();
	
	public Capitan(String name, int strength, int intellegence, int agility, int skill, int health) {
		super(name, strength, intellegence, agility, skill, health);
	}

	@Override
	public void action(List<CrewMember> crew, Starship ship, List<Planet> solarSystem, int locationIndex) {
		// the capitan can boost everyone's morale and up their helth by a little bit
		
		System.out.println(this.getName() + ": \"Let us see 'ere if we gots ourselves any tray-sure...\"");
		
		if((dice.nextInt(10) + 1) == 10) {
			// Adds a random resource from the current planet's resource list to the ship's cargo.
			// - solarSystem.get(locationIndex): Retrieves the planet at the current location in the solar system.
			// - .getResources(): Accesses the list of resources available on the planet.
			// - dice.nextInt(...): Generates a random index based on the size of the planet's resource list.
			// - .get(...): Retrieves the resource at the randomly generated index.
			// - ship.getCargo().add(...): Adds the selected resource to the ship's cargo storage.			
			System.out.println(this.getName() + ": \"WE FOUND SOMETHIN' LADS!\"");
			
			ship.getCargo().add(solarSystem.get(locationIndex).getResources().get(dice.nextInt(solarSystem.get(locationIndex).getResources().size())));
			ship.getCargo().add(solarSystem.get(locationIndex).getResources().get(dice.nextInt(solarSystem.get(locationIndex).getResources().size())));
			ship.getCargo().add(solarSystem.get(locationIndex).getResources().get(dice.nextInt(solarSystem.get(locationIndex).getResources().size())));
			
			System.out.println(ship); //display the cargo

			
		} else {
			System.out.println(this.getName() + ": \"ARRRRGH THERE BE NOTHIN 'ERE BUT JACK SQUAT!\"");
		}
	}
	
	@Override
	public void fight(List<CrewMember> crew, Alien alien) {
		
		System.out.println(this.getName() + ": \"I'm not much of a fighter but blast-it I'm going down with my ship!\"");
		
		//alien = new Alien("Demigorgan", "A sleek, metallic-skinned being with elongated limbs and glowing, crystalline eyes that shift color with their emotions. Their heads are adorned with bioluminescent tendrils that pulse faintly like a living neural network.", 50, "Xaldorian", 15);
		// do we create a new alien or somehow find a way to pass in 
		// the alien that killed SecurityOfficer into this method...
		
		while((alien.getHealth() > 0) && (this.getHealth() > 0)) {
			//fight logic here
				
				//Capitan's turn
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
	                System.out.println("The engineer jumps in to fight!");
	                ((Engineer) crew.get(2)).fight(crew, alien);
	                break;
	            }
				
				pressKey();	
		}
	}

	@Override
	public void catchPhrase() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + ": \"99 bottles of rum on the wall, 98 bottles of-- wait...\"");
	}
	
}
