package finalproj;

import java.util.List;

public class RandomEvent {
    // Instance variables to hold event type and its description
    private String eventType;
    private String description;

    // Constructor to initialize the event type and description
    public RandomEvent(String eventType, String description) {
        this.eventType = eventType;
        this.description = description;
    }

    // Getter method for the event type
    public String getEventType() {
        return eventType;
    }
    
    // Getter method for the event description
    public String getDescription() {
        return description;
    }

    // Method to trigger a random event and print its type and description
    public void triggerEvent() {
        System.out.println("Event Triggered: " + eventType);
        System.out.println("Description: " + description);
    }

    // Method to trigger specific events affecting the ship and crew
    public void triggerEvent(String eventType, Starship ship, List<CrewMember> crew) {
        // Switch statement to handle different types of events
        switch (eventType) {
            case "Plague":
                // If the event is a plague, set all crew members' health to 0
                for (CrewMember member : crew) {
                    member.setHealth(0);
                }
                System.out.println("A deadly plague has spread! All crew health is reduced to 0.");
                break;

            case "Hull Damage":
                // If the event is hull damage, set the ship's hull integrity to 10%
                ship.setHullIntegrity(10);
                System.out.println("The ship suffered critical hull damage! Hull integrity is at 10%.");
                break;

            case "Resource Theft":
                // If the event is resource theft, all resources are stolen (logic to be implemented)
                System.out.println("Pirates have raided the ship! All resources have been stolen.");
                break;

            case "Solar Flare":
                // If the event is a solar flare, reduce all crew members' health by 50%
                for (CrewMember member : crew) {
                    member.setHealth(50);  // Reduces health to 50 (assuming max health is 100)
                }
                System.out.println("A solar flare has struck! All crew health is reduced by 50%.");
                break;

            default:
                // If no known event type is matched, print a default message
                System.out.println("No event triggered.");
                break;
        }
    }
}
