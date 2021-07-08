package test;

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static Stack<Character> left_stack = new Stack<>();
	public static Stack<Character> right_stack = new Stack<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		int N = Integer.parseInt(br.readLine());

		// store the given input to the left stack
		for (int i = 0; i < input.length(); i++) {
			left_stack.push(input.charAt(i));
		}

		// run the program until it ends with given Integer
		while (N-- > 0) {
			String[] str_list = br.readLine().split(" ");

			switch (str_list[0]) {
			case "L":
				L();
				break;

			case "D":
				D();
				break;

			case "B":
				B();
				break;

			case "P":
				P(str_list[1].charAt(0));
				break;
			}
		}

		while (!left_stack.isEmpty()) {
			right_stack.push(left_stack.pop());
		}
		while (!right_stack.isEmpty()) {
			sb.append(right_stack.pop());
		}
		System.out.println(sb);
	}

	// method for L, which is moving a cursor to the left
	public static void L() {
		if (!left_stack.isEmpty()) {
			right_stack.push(left_stack.pop());
		}
	}

	// method for D, which is moving a cursor to the right
	public static void D() {
		if (!right_stack.isEmpty()) {
			left_stack.push(right_stack.pop());
		}
	}

	// method for B, which is deleting a left word of a cursor
	public static void B() {
		if (!left_stack.isEmpty()) {
			left_stack.pop();
		}
	}

	// method for P, which is adding a new word to the left side of a cursor
	public static void P(Character temp) {
		left_stack.push(temp);
	}
}