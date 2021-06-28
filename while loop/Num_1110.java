import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int N = Integer.parseInt(br.readLine());
		int temp = N;
		
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
		}
		while (temp != N);
		
		System.out.println(count);
	}
}
