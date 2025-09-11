package finalproj;

public abstract class SpaceEntity { //demonstrates abstraction so an alien or planet can use this class
	protected String name;
	protected String description;
	//demonstrates encapsulation and field scope
	
	public SpaceEntity(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
