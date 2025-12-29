# GalaxyofJavaQuest

**GalaxyofJavaQuest** is a Java console-based adventure where players command a starship crew exploring distant planets. Manage resources, scan for alien life, collect valuable materials, and survive random cosmic events as you navigate through a procedurally populated solar system.

> _This project was created as part of **Computing Science Concepts II 2425 (Fall 2024)** at **St. Edward's University**._


## Overview

**GalaxyofJavaQuest** puts you in command of the SS Latrexa, a starship crewed by four unique specialists. Travel between planets, gather resources, encounter alien lifeforms, and manage your ship's vital systems. Each crew member brings distinct abilities that can mean the difference between survival and defeat in the depths of space.

Your mission evolves dynamically as you explore—random events can strike at any moment, testing your ability to adapt and survive in an unforgiving universe.


## Features

- **Crew Management System**
  - Four specialized crew members: Captain, Security Officer, Engineer, and Scientist
  - Each crew member has unique stats (strength, intelligence, agility, skill, health)
  - Character-specific abilities and catchphrases

- **Space Exploration**
  - Five distinct planets to visit, each with unique descriptions and resources
  - Dynamic fuel consumption based on travel distance
  - 30 different resource types procedurally distributed across planets

- **Combat System**
  - Turn-based alien encounters with the Security Officer leading the charge
  - Crew succession system—if one falls, another steps in to fight
  - Randomized combat outcomes for replayability

- **Resource Collection**
  - Captain can scan planets for valuable materials
  - Ship cargo system to store discovered resources
  - Resources range from common ores to exotic alien artifacts

- **Ship Systems**
  - Fuel management—plan your jumps carefully
  - Hull integrity tracking
  - Engineer can repair ship damage
  - Scientist can refuel the ship (limited uses)

- **Random Events**
  - Plague: Devastating health loss to entire crew
  - Hull Damage: Critical structural failures
  - Resource Theft: Pirates raid your cargo
  - Solar Flare: Radiation damage to crew

- **Win/Loss Conditions**
  - Lose if all crew members die
  - Lose if fuel reaches zero
  - Strategic resource management is key to survival


## How to Run

1. Clone this repository
2. Open the project in your Java IDE (Eclipse, IntelliJ IDEA, etc.)
3. Navigate to `src/finalproj_test/GameDriver.java`
4. Run the main method

### Requirements

- Java Development Kit (JDK) 8 or newer
- Java IDE or command line compiler

### Running Test Cases

For testing edge cases and corner scenarios:
1. Navigate to `src/finalproj_test/GameDriver_test.java`
2. Run the main method
3. Select from the following test scenarios:
   - Normal Operation
   - Depleted Fuel Edge Case
   - No Fuel + Unwinnable Combat Corner Case
   - Cargo Capacity Overflow
   - Instant Crew Death (Plague Event)
   - Excessive Random Event Triggers


## Gameplay

### Controls
During gameplay, you'll make choices via numbered menu options:

**Main Actions:**
- `1` - Travel to another planet (costs fuel)
- `2` - Scan for resources (Captain's ability)
- `3` - Scan for lifeforms (Security Officer's ability)
- `4` - Quit game

**Crew Abilities:**
- **Captain (Spock):** Resource scanning with chance to find 3 items
- **Security Officer (Travis):** Alien detection and combat specialist
- **Engineer (Adam):** Hull repair (+10 integrity)
- **Scientist (Taylor):** Emergency refueling (3 uses only)

### Game Tips
- Monitor fuel levels carefully—travel costs scale with distance
- Keep crew health high by avoiding unnecessary alien encounters
- Balance resource collection with survival priorities
- Random events have a 1% trigger chance per action (100% in test mode)


## Tech Stack

- **Language:** Java
- **Architecture:** Object-Oriented Design with Inheritance, Polymorphism, and Encapsulation
- **Data Structures:** ArrayList (Java Collection Framework)
- **Design Patterns:** 
  - Inheritance hierarchy (SpaceEntity → Planet/Resource, CrewMember → specialized roles)
  - Interface implementation (CrewMemberAction)
  - Polymorphism for crew member actions


## What I Learned

- Implementing inheritance hierarchies and abstract classes in Java
- Using interfaces to define behavioral contracts across different classes
- Managing game state with collections and object-oriented principles
- Designing turn-based combat systems with succession mechanics
- Creating procedurally generated content (planet resources)
- Handling edge cases and implementing comprehensive test scenarios
- Building text-based user interfaces with menu systems and input validation


## Project Structure

```
finalproj/
├── Alien.java              # Alien entity with health/strength
├── Capitan.java            # Captain crew member (resource scanning)
├── CrewMember.java         # Base crew member class
├── CrewMemberAction.java   # Interface for crew actions
├── Engineer.java           # Engineer crew member (repairs)
├── Planet.java             # Planet entity with resources
├── RandomEvent.java        # Event system (plague, damage, etc.)
├── Resource.java           # Collectible resource entity
├── Scientist.java          # Scientist crew member (refueling)
├── SecurityOfficer.java    # Security Officer (combat)
├── SpaceEntity.java        # Abstract base for space objects
└── Starship.java           # Ship with fuel, cargo, hull

finalproj_test/
├── GameDriver.java         # Main game loop
└── GameDriver_test.java    # Test suite with edge cases
```


## Key OOP Concepts Demonstrated

- **Inheritance:** SpaceEntity serves as parent to Planet, Resource, and Alien; CrewMember serves as parent to all crew roles
- **Polymorphism:** Crew members stored in List<CrewMember> but execute role-specific actions
- **Encapsulation:** Private fields with public getters/setters across all classes
- **Abstraction:** SpaceEntity abstract class defines common properties
- **Interface Implementation:** CrewMemberAction interface ensures consistent crew behavior
- **Java Collections Framework:** ArrayList used for crew, planets, resources, and cargo


## Notes

This project was built for academic purposes to demonstrate object-oriented programming principles in Java. The game features a complete gameplay loop with multiple systems working together—exploration, combat, resource management, and random events—all tied together through well-structured OOP design.
