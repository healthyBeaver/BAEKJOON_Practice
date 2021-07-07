package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int[] stack;
	public static int size;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// receive the provided Integer
		int N = Integer.parseInt(br.readLine());
		// make a stack with provided size
		stack = new int[N];

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {

			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;

			case "pop":
				System.out.println(pop());
				break;

			case "size":
				System.out.println(size());
				break;

			case "empty":
				System.out.println(empty());
				break;

			case "top":
				System.out.println(top());
				break;
			}
		}
	}

	// method for push
	public static void push(int item) {
		stack[size] = item;
		size++;
	}

	// method for pop
	public static int pop() {
		if (size == 0) {
			return -1;
		} else {
			int return_val = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return return_val;
		}
	}

	// method for size
	public static int size() {
		return size;
	}

	// method for empty
	public static int empty() {
		if (size == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	// method for top
	public static int top() {
		if (size == 0) {
			return -1;
		} else {
			return stack[size - 1];
		}
	}
}