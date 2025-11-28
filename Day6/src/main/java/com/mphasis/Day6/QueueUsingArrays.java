package com.mphasis.Day6;

import java.util.Scanner;

public class QueueUsingArrays {
	private static int[] queue = new int[20];
	private static int front = -1;
	private static int rear = -1;

	public static boolean isEmpty() {
		return ((rear == -1) && (front == -1)) || front > rear;
	}

	public static boolean isFull() {
		return rear == queue.length;
	}

	public static void insert(int num) {
		if (isFull())
			System.err.println("Memory Out of Bound");
		else if (rear == -1) {
			front = 0;
			System.out.print("Enter data to be inserted : ");
			Scanner sc1 = new Scanner(System.in);
			queue[++rear] = sc1.nextInt();
		} else {
			System.out.print("Enter data to be inserted : ");
			Scanner sc2 = new Scanner(System.in);
			queue[++rear] = sc2.nextInt();
		}

	}
	public static void delete() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!!");
			front = rear = -1;
		}
		else {
			System.out.println("Deleted elemnet : "+queue[front++]);
			if(front>rear)
				front=rear=-1;
		}
	}
}
