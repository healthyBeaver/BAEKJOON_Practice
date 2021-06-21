import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		// print out the sum of two numbers
		while (true) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			// if A and B is both 0, break
			if (A == 0 && B == 0) {
				break;
			}
			sb.append(A + B).append('\n');
		}
		System.out.println(sb);
	}
}