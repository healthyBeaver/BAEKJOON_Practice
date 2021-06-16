import java.util.Scanner;

/*
 * Problem:
 * If a given year is a leap year, print "1." Otherwise, print "0."
 * A leap year is a multiple of 4 and 400 but not 100.
 */

public class Main{
	public static void main(String args[]){
		Scanner scnr = new Scanner(System.in);
		// read a given year
		int year = scnr.nextInt();

		// if the given year is a multiple of 4
		if (year % 4 == 0) {
			// if the given year is not a multiple of 100
			// or it is a multiple of 400 
			if ((year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
		// if the given year is not a multiple of 4
		else {
			System.out.println("0");
		}
	}
}