
public class Group {
	
	
	
	private Person p1;
	private Person p2;
	private Person p3;
	private Person p4;
	
	// Constructor for Group class. Takes 4 Persons
	public Group(Person p1, Person p2, Person p3, Person p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	
	
	/* Returns the happiness of a particular group
	 * 
	 * Happiness is defined by the total compatibility of a group,
	 * 12 being the largest, 0 being the smallest
	 * 
	 */
	public int happiness() {
		
		int pair1 = p1.compatibility(p2);
		int pair2 = p1.compatibility(p3);
		int pair3 = p1.compatibility(p4);
		int pair4 = p2.compatibility(p3);
		int pair5 = p2.compatibility(p4);
		int pair6 = p3.compatibility(p4);
		
		return(pair1 + pair2 + pair3 + pair4 + pair5 + pair6); 
		
	}
	
	// Returns the names of the group on new lines
	public String toString() {
		return(p1.toString() + '\n'+ p2.toString() + '\n' + p3.toString() + '\n' + p4.toString());
	}

}
