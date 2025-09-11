package finalproj;

import java.util.ArrayList;
import java.util.List;

public class Starship {
	private String shipName;
	private int fuelLevel;
	private int cargoCapacity;
	private int hullIntegrity;
	// using JCF
	private List <Resource> cargo;
	
	public Starship(String shipName, int fuelLevel, int cargoCapacity, int hullIntegrity) {
		this.setShipName(shipName);
		this.setFuelLevel(fuelLevel);
		this.setCargoCapacity(cargoCapacity);
		this.setCargo(new ArrayList<>());
		this.setHullIntegrity(hullIntegrity);
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public int getHullIntegrity() {
		return hullIntegrity;
	}

	public void setHullIntegrity(int hullIntegrity) {
		this.hullIntegrity = hullIntegrity;
	}

	public List <Resource> getCargo() {
		return cargo;
	}

	public void setCargo(List <Resource> cargo) {
		this.cargo = cargo;
	}
	
	@Override // our toString method override
	public String toString () {
		if (cargo.isEmpty()) {
	        return "The Cargo is empty.";
	    }

	    String result = "Cargo Contents:\n";
	    for (int i = 0; i < cargo.size(); i++) {
	        result += (i + 1) + ". " + cargo.get(i).name + "\n";
	    }
	    return result;
	}

}
