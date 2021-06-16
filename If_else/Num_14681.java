import java.util.Scanner;

/*
 * Problem: find corresponding Quadrant based on the location of x and y
 * 
 */
public class Main{
	public static void main(String args[]){
		Scanner scnr = new Scanner(System.in);
		
		// read given x and y locations
		int x = scnr.nextInt();
		int y = scnr.nextInt();
		
		// if it is in Quadrant 1
		if (x > 0 && y > 0) {
			System.out.println("1");
		}
		
		// if it is in Quadrant 4
		else if (x > 0 && y < 0) {
			System.out.println("4");
		}
		
		// if it is in Quadrant 2
		else if (x < 0 && y > 0) {
			System.out.println("2");
		}
		
		// if it is in Quadrant 3
		else {
			System.out.println("3");
		}
	}
}