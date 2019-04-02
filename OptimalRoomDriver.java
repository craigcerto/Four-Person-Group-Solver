import java.util.ArrayList;
import java.util.Scanner;

/* The Optimal Room Driver uses 8 users' inputs of their top three choices for
 * group partners to determine the maximum happiness for the entire 8 people.
 * 
 * Using 3360 group combinations with 8 people, the Optimal Room Driver
 * determines compatibility for each person within a specific group to
 * calculate the total group happiness and finally, the Boys of 2 South's happiness
 * 
 * Compatibility is determined through 0, 1, or 2 points
 * 
 * 0 points if neither person had each other as a choice
 * 1 point if one person had another as a choice
 * 2 points if both people had each other as a choice
 *
 * Happiness is the total compatibility of the group (0 - 12)
 * 
 * 
 * Inputs into the Optimal Room Driver are case sensitive
 * 
 */
public class OptimalRoomDriver {
	
	private Person p1;
	private Person p2;
	private Person p3;
	private Person p4;
	private Person p5;
	private Person p6;
	private Person p7;
	private Person p8;
	
	//This method uses combinations from ComboSolve and inputs from the user
	//to determine the optimal group
	public void findOptimalGroups() {
		
		//input from user
		createPeople();
		
		//array of inputed users, converted from integers
		ArrayList<ArrayList<Person>> combinations;
		combinations = comboConverter();
		
		
		Group optimal1 = null;
		Group optimal2 = null;
		int optimal1Points = 0;
		int optimal2Points = 0;
		int highestPairPoints = 0;
		
		//when a new combination is found with a higher happiness than any other group
		//pair, the old groups are replaced with the new groups
		for(int i = 0; i < combinations.size(); i += 2) {
			Person a = combinations.get(i).get(0);
			Person b = combinations.get(i).get(1);
			Person c = combinations.get(i).get(2);
			Person d = combinations.get(i).get(3);
			
			Person e = combinations.get(i + 1).get(0);
			Person f = combinations.get(i + 1).get(1);
			Person g = combinations.get(i + 1).get(2);
			Person h = combinations.get(i + 1).get(3);
			
			Group one = new Group(a, b, c, d);
			Group two = new Group(e, f, g, h);
			
			int g1 = one.happiness();
			int g2 = two.happiness();
			
			if(g1 + g2 > highestPairPoints) {
				highestPairPoints = g1 + g2;
				
				optimal1Points = g1;
				optimal2Points = g2;
				
				optimal1 = one;
				optimal2 = two;
			}
			

		}
		for(int i = 0; i < 100; i++) {
			System.out.println("");
		}
		
		//output for user
		System.out.println("");
		System.out.println("After " + (combinations.size()/2) + " combinations, the optimal groups are: ");
		System.out.println("");
		System.out.println(optimal1.toString());
		//System.out.println("");
		//System.out.println("With a happiness rating of: " + optimal1Points);
		System.out.println("");
		System.out.println(optimal2.toString());
		//System.out.println("");
		//System.out.println("With a happiness rating of: " + optimal2Points);
		System.out.println("");
		System.out.print("For a total of " + (optimal1Points + optimal2Points) + " happiness points :)");
		
		for(int i = 0; i < 20; i++) {
			System.out.println("");
		}
		
	}
	
	//This method gets user data and forms each user into a Person
	//with a name and room choices
	private void createPeople() {
		
		//Person 1
		
		for(int i = 0; i < 100; i++) {
			System.out.println("");
		}
		
		String name1;
		ArrayList<String> choices1 = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name1 = s.next();
		
		System.out.print("Choice 1: ");
		String choice1 = s.next();
		
		System.out.print("Choice 2: ");
		String choice2 = s.next();
		
		System.out.print("Choice 3: ");
		String choice3 = s.next();
		
		choices1.add(choice1); choices1.add(choice2); choices1.add(choice3);
		p1 = new Person(name1);
		
		for(int i = 0; i < 100; i++) {
			System.out.println("");
		}
		
		//Person 2
		String name2;
		ArrayList<String> choices2 = new ArrayList<>();
		
		System.out.print("Enter your name: ");
		name2 = s.next();
		
		System.out.print("Choice 1: ");
		choice1 = s.next();
		
		System.out.print("Choice 2: ");
		choice2 = s.next();
		
		System.out.print("Choice 3: ");
		choice3 = s.next();
		
		choices2.add(choice1); choices2.add(choice2); choices2.add(choice3);
		
		p2 = new Person(name2);
		
		for(int i = 0; i < 100; i++) {
			System.out.println("");
		}
		
		//Person 3
		String name3;
		ArrayList<String> choices3 = new ArrayList<>();
		
		System.out.print("Enter your name: ");
		name3 = s.next();
		
		System.out.print("Choice 1: ");
		choice1 = s.next();
		
		System.out.print("Choice 2: ");
		choice2 = s.next();
		
		System.out.print("Choice 3: ");
		choice3 = s.next();
		
		choices3.add(choice1); choices3.add(choice2); choices3.add(choice3);
		p3 = new Person(name3);
		
		for(int i = 0; i < 100; i++) {
			System.out.println("");
		}
		
		//Person 4
		String name4;
		ArrayList<String> choices4 = new ArrayList<>();
		
		System.out.print("Enter your name: ");
		name4 = s.next();
		
		System.out.print("Choice 1: ");
		choice1 = s.next();
		
		System.out.print("Choice 2: ");
		choice2 = s.next();
		
		System.out.print("Choice 3: ");
		choice3 = s.next();
		
		choices4.add(choice1); choices4.add(choice2); choices4.add(choice3);
		p4 = new Person(name4);
		
		for(int i = 0; i < 100; i++) {
			System.out.println("");
		}
		
		//Person 5
		String name5;
		ArrayList<String> choices5 = new ArrayList<>();
		
		System.out.print("Enter your name: ");
		name5 = s.next();
		
		System.out.print("Choice 1: ");
		choice1 = s.next();
		
		System.out.print("Choice 2: ");
		choice2 = s.next();
		
		System.out.print("Choice 3: ");
		choice3 = s.next();
		
		choices5.add(choice1); choices5.add(choice2); choices5.add(choice3);
		p5 = new Person(name5);
		
		for(int i = 0; i < 100; i++) {
			System.out.println("");
		}
		
		//Person 6
		String name6;
		ArrayList<String> choices6 = new ArrayList<>();
		
		System.out.print("Enter your name: ");
		name6 = s.next();
		
		System.out.print("Choice 1: ");
		choice1 = s.next();
		
		System.out.print("Choice 2: ");
		choice2 = s.next();
		
		System.out.print("Choice 3: ");
		choice3 = s.next();
		
		choices6.add(choice1); choices6.add(choice2); choices6.add(choice3);
		p6 = new Person(name6);
		
		for(int i = 0; i < 100; i++) {
			System.out.println("");
		}
		
		//Person 7
		String name7;
		ArrayList<String> choices7 = new ArrayList<>();
		
		System.out.print("Enter your name: ");
		name7 = s.next();
		
		System.out.print("Choice 1: ");
		choice1 = s.next();
		
		System.out.print("Choice 2: ");
		choice2 = s.next();
		
		System.out.print("Choice 3: ");
		choice3 = s.next();
		
		choices7.add(choice1); choices7.add(choice2); choices7.add(choice3);
		p7 = new Person(name7);
		
		for(int i = 0; i < 100; i++) {
			System.out.println("");
		}
		
		//Person 8
		String name8;
		ArrayList<String> choices8 = new ArrayList<>();
		
		System.out.print("Enter your name: ");
		name8 = s.next();
		
		System.out.print("Choice 1: ");
		choice1 = s.next();
		
		System.out.print("Choice 2: ");
		choice2 = s.next();
		
		System.out.print("Choice 3: ");
		choice3 = s.next();
		
		choices8.add(choice1); choices8.add(choice2); choices8.add(choice3);
		p8 = new Person(name8);
		
		ArrayList<Person> realChoices1 = this.convertToPerson(choices1);
		p1.addChoices(realChoices1);
		
		ArrayList<Person> realChoices2 = this.convertToPerson(choices2);
		p2.addChoices(realChoices2);
		
		ArrayList<Person> realChoices3 = this.convertToPerson(choices3);
		p3.addChoices(realChoices3);
		
		ArrayList<Person> realChoices4 = this.convertToPerson(choices4);
		p4.addChoices(realChoices4);
		
		ArrayList<Person> realChoices5 = this.convertToPerson(choices5);
		p5.addChoices(realChoices5);
		
		ArrayList<Person> realChoices6 = this.convertToPerson(choices6);
		p6.addChoices(realChoices6);
		
		ArrayList<Person> realChoices7 = this.convertToPerson(choices7);
		p7.addChoices(realChoices7);
		
		ArrayList<Person> realChoices8 = this.convertToPerson(choices8);
		p8.addChoices(realChoices8);
		
		s.close();
		
	}
	
	//Converts inputed names into people
	private ArrayList<Person> convertToPerson(ArrayList<String> names) {
		
		ArrayList<Person> converted = new ArrayList<>();
		
		for(String x: names) {
			if(x.equals(p1.getName())) {
				converted.add(p1);
			}else if(x.equals(p2.getName())){
				converted.add(p2);
			}else if(x.equals(p3.getName())){
				converted.add(p3);
			}else if(x.equals(p4.getName())){
				converted.add(p4);
			}else if(x.equals(p5.getName())){
				converted.add(p5);
			}else if(x.equals(p6.getName())){
				converted.add(p6);
			}else if(x.equals(p7.getName())){
				converted.add(p7);
			}else if(x.equals(p8.getName())){
				converted.add(p8);
			}
		}
		return converted;
		
	}
	
	//Converts combinations from ComboSolve into people
	private ArrayList<ArrayList<Person>> comboConverter(){
		
		ArrayList<ArrayList<Person>> newCombinations = new ArrayList<>();
		ArrayList<ArrayList<Integer>> oldCombinations = ComboSolver.getCombinations();
		
		for(ArrayList<Integer> x : oldCombinations) {
			
			ArrayList<Person> big = new ArrayList<Person>();
			
			for(Integer y: x) {
				if(y == 1) {
					big.add(p1);
				}else if(y == 2) {
					big.add(p2);
				}else if(y == 3) {
					big.add(p3);
				}else if(y == 4) {
					big.add(p4);
				}else if(y == 5) {
					big.add(p5);
				}else if(y == 6) {
					big.add(p6);
				}else if(y == 7) {
					big.add(p7);
				}else if(y == 8) {
					big.add(p8);
				}
			}
			
			newCombinations.add(big);
		}
		
		return newCombinations;
		
	}
	
	
	
}
