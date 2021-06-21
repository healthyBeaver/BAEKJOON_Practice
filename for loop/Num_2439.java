import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		// read the given N
		int N = Integer.parseInt(br.readLine());
		br.close();

		// print "*"
		for (int i = 1; i <= N; i++) {
			
			// make blank and goes to the back position
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			
			// print the "*"
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			
			// goes to the next line
			System.out.println("");
		}
	}
}