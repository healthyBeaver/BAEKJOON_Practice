package test;

import java.util.*;
import java.io.*;

public class Main {

	public static int[] stack;
	public static int size;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack = new Stack<Character>();
		int N = Integer.parseInt(br.readLine());

		// run until the program reads the given inputs
		while (N-- > 0) {
			String input = br.readLine() + "\n";

			// change string input to array of character
			for (char ch : input.toCharArray()) {
				// if the character in array is a space or next line token,
				// pop and empty the stack (initialize by popping)
				if (ch == ' ' || ch == '\n') {
					while (!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(ch);
				}
				// if the character in array is a normal character, just add to the stack
				else {
					stack.push(ch);
				}
			}
		}
		bw.flush();
		return;
	}
}