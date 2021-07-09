package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int[] queue;
	public static int size;
	public static int first = 0;
	public static int end = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// receive the provided Integer
		int N = Integer.parseInt(br.readLine());
		queue = new int[N];

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

			case "front":
				System.out.println(front());
				break;

			case "back":
				System.out.println(back());
				break;
			}
		}
	}

	// method for push
	public static void push(int item) {
		queue[end] = item;
		end++;
	}

	// method for pop
	public static int pop() {
		if (first == end) {
			return -1;
		} else {
			int return_val = queue[first];
			queue[first] = 0;
			first++;
			return return_val;
		}
	}

	// method for size
	public static int size() {
		return end - first;
	}

	// method for empty
	public static int empty() {
		if (first == end) {
			return 1;
		} else {
			return 0;
		}
	}

	// method for front
	public static int front() {
		if (first == end) {
			return -1;
		} else {
			return queue[first];
		}
	}

	// method for back
	public static int back() {
		if (first == end) {
			return -1;
		} else {
			return queue[end - 1];
		}
	}
}