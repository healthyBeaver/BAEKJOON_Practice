import java.util.Scanner;

/*
 * Problem #: 2588
 * 
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);

		int A = scnr.nextInt();
		String B = scnr.next();

		// get the unit digit
		int int_first = Character.getNumericValue(B.charAt(2));
		// get the tenth digit
		int int_second = Character.getNumericValue(B.charAt(1));
		// get the 100th digit
		int int_third = Character.getNumericValue(B.charAt(0));

		// results of multiplication
		int multi_first = A * int_first;
		int multi_second = A * int_second;
		int multi_third = A * int_third;

		// get the final result
		int final_result = multi_first + (multi_second * 10)
				+ (multi_third * 100);

		System.out.println(multi_first);
		System.out.println(multi_second);
		System.out.println(multi_third);
		System.out.println(final_result);
	}
}