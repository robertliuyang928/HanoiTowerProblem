public class HanoiProblem {

	public static void main(String[] args) {
		// Hanoi Tower Problem Implementation
		// Move n Plats from Source peg to Destination peg with the help of Temporary peg.
	
		int n=15;//n as the number of plates to move
		HanoiTower (n, "A", "B", "C");
	}
	
	public static void HanoiTower (int n, String s, String t, String d){
		if (n==1){	
			System.out.println("Plate " + n + " is mored from peg " + s + " to peg " + d);
		}
		else {			
			HanoiTower (n-1, s, d, t);
			System.out.println("Plate " + n + " is mored from peg " + s + " to peg " + d);
			HanoiTower (n-1, t, s, d);
		}
	}


}
