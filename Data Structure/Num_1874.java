package test;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int start = 0;

		// run until the program reads the given inputs
		while (N-- > 0) {
			int input = Integer.parseInt(br.readLine());
			// track the starting point for the next step
			if (input > start) {
				for (int i = start + 1; i <= input; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				start = input;
			}
			// if the last input is not equal to the input, then it is invalid
			else if (stack.peek() != input) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append('-').append('\n');
		}

		System.out.println(sb);
	}
}