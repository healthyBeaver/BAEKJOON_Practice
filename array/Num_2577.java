import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int finalVal = A * B * C;
		int[] arr = new int[10];

		while (finalVal != 0) {
			arr[finalVal%10]++;
			finalVal = finalVal / 10;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}