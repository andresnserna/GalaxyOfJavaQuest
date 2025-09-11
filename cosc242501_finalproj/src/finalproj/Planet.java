package finalproj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
// subclass of SpaceEntity
public class Planet extends SpaceEntity {
    // List to hold the resources found on the planet
    private List<Resource> resources = new ArrayList<>();

    // Constructor for the Planet class
    public Planet(String name, String description) {
        // Call the constructor of the superclass (SpaceEntity) to initialize the planet's name and description
        super(name, description);
        
        // Create a map of resource names and their descriptions
        Map<String, String> objects = new HashMap<>();
        
        // Adding various resources with descriptions to the map
        objects.put("Water", "A vast supply of drinkable water.");
        objects.put("Iron Ore", "Rich deposits of iron ore.");
        objects.put("Gold", "Precious gold reserves.");
        objects.put("Energy Crystal", "A rare and potent energy source.");
        objects.put("Alien Artifact", "An ancient artifact of unknown origin.");
        objects.put("Flora", "Exotic plants with medicinal properties.");
        objects.put("Fauna", "Wildlife adapted to the harsh environment.");
        objects.put("Uranium", "High-grade uranium for energy production.");
        objects.put("Plasma Core", "A powerful plasma energy core.");
        objects.put("Frozen Gas", "A frozen gas ideal for fuel production.");
        objects.put("Copper", "Rich veins of conductive copper.");
        objects.put("Silicon", "Deposits of silicon for advanced electronics.");
        objects.put("Dark Matter", "An enigmatic substance defying known physics.");
        objects.put("Alien Relic", "A mystical relic imbued with alien technology.");
        objects.put("Diamond", "Vast deposits of uncut diamonds.");
        objects.put("Obsidian", "Jet-black volcanic glass.");
        objects.put("Hydrogen", "Highly pure hydrogen gas.");
        objects.put("Nitrogen", "Concentrated nitrogen for agriculture.");
        objects.put("Sulfur", "A large quantity of sulfur for manufacturing.");
        objects.put("Magnesium", "Lightweight magnesium deposits.");
        objects.put("Zirconium", "A rare element with industrial applications.");
        objects.put("Tritium", "A radioactive isotope used for power generation.");
        objects.put("Antimatter", "A highly dangerous yet powerful substance.");
        objects.put("Helium-3", "An isotope useful for fusion reactors.");
        objects.put("Graphite", "High-quality graphite for materials.");
        objects.put("Exotic Gas", "A gas with unusual chemical properties.");
        objects.put("Rare Earth Metals", "Essential for high-tech manufacturing.");
        objects.put("Quantum Particles", "Particles with strange quantum properties.");
        objects.put("Neutronium", "A dense material formed under extreme conditions.");
        objects.put("Crystal Shards", "Beautiful crystalline fragments.");
        
        // Populate the planet with random resources from the map
        populatePlanet(objects);
    }

    // Getter method to retrieve the resources list
    public List<Resource> getResources(){
        return resources;
    }

    // Helper method to populate the planet with a set of random resources
    private void populatePlanet(Map<String, String> objects) {
        Random random = new Random(); // Random generator to select random resources
        List<String> keys = new ArrayList<>(objects.keySet());  // Get a list of the keys (resource names) from the map
        
        // Loop to populate the planet with 10 random resources
        for (int i = 0; i < 10; i++) {
            // Select a random resource name from the map keys
            String resourceName = keys.get(random.nextInt(keys.size()));
            // Get the description of the selected resource from the map
            String description = objects.get(resourceName);
            // Add the resource to the planet's resource list
            resources.add(new Resource(resourceName, description));
        }
    }

    // Overriding toString() method to represent the planet as a string with its name and description
    @Override
    public String toString() {
        return this.name + ": " + this.description;
    }
}
