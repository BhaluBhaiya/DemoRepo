package com.mphasis.Day6;

public class StackUsingArray {

	private static int[] nums = new int[20];
	private static int top = -1;

	public static boolean isEmpty() {
		return top == -1;
	}

	public static boolean isFull() {
		return top == nums.length;
	}

	public static void push(int num) {
		if (isFull())
			System.err.println("Stack Overflow");
		else {
			nums[++top] = num;
		}
	}

	static void pop() {
		if (isEmpty())
			System.err.println("Stack Underflow");
		else {
			System.out.println(nums[top]);
			nums[top--] = 0;
		}

	}

	public static void display() {
		for (int i =0; i<=top;i++) {
			System.out.println(nums[i]);
		}
	}
	public static void peek() {
		System.out.println("element at top : "+nums[top]);
	}

	public static void main(String[] args) {
		push(12);
		push(26);
		push(37);
		display();
		peek();
	}
}
