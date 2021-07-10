package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int[] deque;
	public static int size;
	public static int first = 10000;
	public static int end = 10000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// receive the provided Integer
		int N = Integer.parseInt(br.readLine());
		deque = new int[20001];

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {

			case "push_front":
				pushFront(Integer.parseInt(st.nextToken()));
				break;

			case "push_back":
				pushBack(Integer.parseInt(st.nextToken()));
				break;

			case "pop_front":
				System.out.println(popFront());
				break;

			case "pop_back":
				System.out.println(popBack());
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

	// method for push_front
	public static void pushFront(int item) {
		deque[first] = item;
		first--;
		size++;
	}

	// method for push_back
	public static void pushBack(int item) {
		end++;
		size++;
		deque[end] = item;
	}

	// method for pop_front
	public static int popFront() {
		if (size == 0) {
			return -1;
		} else {
			int return_val = deque[first + 1];
			first++;
			size--;
			return return_val;
		}
	}

	// method for pop_back
	public static int popBack() {
		if (size == 0) {
			return -1;
		} else {
			int return_val = deque[end];
			end--;
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

	// method for front
	public static int front() {
		if (size == 0) {
			return -1;
		} else {
			return deque[first + 1];
		}
	}

	// method for back
	public static int back() {
		if (size == 0) {
			return -1;
		} else {
			return deque[end];
		}
	}
}