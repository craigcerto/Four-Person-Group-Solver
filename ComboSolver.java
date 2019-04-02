import java.util.ArrayList;

public class ComboSolver {

	private static ArrayList<ArrayList<Integer>> combinations = new ArrayList<>();
	
	public static ArrayList<ArrayList<Integer>> getCombinations(){
		comboFinder();
		return combinations;
	}
	
	private static void comboFinder() {
		
		for(int a = 1; a <= 8; a++) {
			for(int b = 1; b <= 8; b++) {
				for(int c = 1; c <= 8; c++) {
					for(int d = 1; d <= 8; d++) {
						if(areDifferent(a,b,c,d) && withinInterval(a,b,c,d)) {
							ArrayList<Integer> combo = new ArrayList<>();
							combo.add(a);
							combo.add(b);
							combo.add(c);
							combo.add(d);
							
							ArrayList<Integer> combo2 = new ArrayList<>();
							combo2.add(1);
							combo2.add(2);
							combo2.add(3);
							combo2.add(4);
							combo2.add(5);
							combo2.add(6);
							combo2.add(7);
							combo2.add(8);
							
							for(int i = 0; i < 4; i++) {
								combo2.remove(combo.get(i));
							}
							
							combinations.add(combo);
							combinations.add(combo2);
						}
					}
				}
			}
		}
	}
	
	private static boolean areDifferent(int a, int b, int c, int d) {
		if( a!= b && a != c && a!= d && b != c && b!= d && c != d) {
			return true;
		}else {
			return false;
		}
	}
	
	private static boolean withinInterval(int a, int b, int c, int d) {
		if((a +b + c + d) >= 10 && (a+b+c+d) <= 26) {
			return true;
		}else {
			return false;
		}
	}
}