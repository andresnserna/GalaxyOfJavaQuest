package finalproj;

import java.util.List;

public interface CrewMemberAction {
	//void action();
	void fight(List<CrewMember> crew, Alien alien);
	void catchPhrase();
	//void action(ArrayList<CrewMember> crew);
	void action(List<CrewMember> crew, Starship ship, List<Planet> solarSystem, int num);
}
