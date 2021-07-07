package test;

import java.util.*;
import java.io.*;

public class Main {

	public static int[] stack;
	public static int size;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// run until the program reads the given inputs
		while (N-- > 0) {
			Stack<Character> stack = new Stack<>();
			boolean isVPS = true;
			String input = br.readLine() + "\n";

			// change string input to array of character
			for (char ch : input.toCharArray()) {
				// if a character is (, then add to the stack
				if (ch == '(') {
					stack.push(ch);
				}
				// if a character is ), then pop the existing ( in the stack
				else if (ch == ')') {
					if (!stack.isEmpty()) {
						stack.pop();
					}
					// however, if the stack is empty, then it is not VPS, so it is false
					else {
						isVPS = false;
						break;
					}
				}
			}

			// if the stack is not empty, then it is not VPS, so it is false
			if (!stack.isEmpty()) {
				isVPS = false;
			}

			// if the stack is empty after all process, then it is VPS
			if (isVPS == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}