import java.util.Scanner;

/*
 * Problem: Person A wants to wake up earlier than standard time.
 * Therefore, the person decided to change his clock to alarm 45 minutes before
 * the standard time. With given hour and minute, write a code.
 */
public class Main{
	public static void main(String args[]){
		Scanner scnr = new Scanner(System.in);
		
		// read given hour and minute
		int H = scnr.nextInt();
		int M = scnr.nextInt();
		
		// if subtraction between standard minute and 45 is greater than or
		// equal to 0, 
		if (M - 45 >= 0) {
			M = M - 45;
			System.out.print(H + " " + M);
		}
		// if subtraction between standard minute and 45 is less than 0,
		else {
			M = (M + 60) - 45;
			if (H == 0) {
				H = 23;
			}
			else {			
				H -= 1;
			}
			System.out.print(H + " " + M);
		}
	}
}