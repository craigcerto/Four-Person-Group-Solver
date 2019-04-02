import java.util.ArrayList;

public class Person {

	private String name;
	private ArrayList<Person> choices;
	
	public Person(String name) {
		this.name = name;
		this.choices = null;
	}
	
	public void addChoices(ArrayList<Person> choices) {
		this.choices = choices;
	}
	
	public String getName() {
		return name;
	}
	/* Returns the compatibility of the current person and another person
	 * 
	 * Compatibility is determined through 0, 1, or 2 points
	 * 
	 * 0 points if neither person had each other as a choice
	 * 1 point if one person had another as a choice
	 * 2 points if both people had each other as a choice
	 * 
	 */
	public int compatibility(Person other) {
		
		int totalPoints = 0;
		
		
		for(int i = 0; i < 3; i++) {
			if(other.choices.get(i).getName().compareTo(this.name) == 0) {
				totalPoints += 1;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			if(this.choices.get(i).getName().compareTo(other.name) == 0) {
				totalPoints += 1;
			}
		}
		
		
		return totalPoints;
		
	}
	
	// Returns the name of the person
	public String toString() {
		return name;
	}
}
