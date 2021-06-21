import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		// read given N and X from the first line
		StringTokenizer given_st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(given_st.nextToken());
		int X = Integer.parseInt(given_st.nextToken());
		
		// read N integers from the second line
		StringTokenizer input_st = new StringTokenizer(br.readLine(), " ");
		
		// string builder for the output
		StringBuilder sb = new StringBuilder();
		
		br.close();

		// compare X and integers
		for (int i = 1; i <= N; i++) {
			int input_val = Integer.parseInt(input_st.nextToken());
			
			if (input_val < X) {
				sb.append(input_val).append(' ');
			}
		}
		System.out.println(sb);
	}
}