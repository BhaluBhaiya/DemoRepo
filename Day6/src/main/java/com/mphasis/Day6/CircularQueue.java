package com.mphasis.Day6;

import java.util.Scanner;

public class CircularQueue {
	private static int front = -1;
	private static int rear = -1;
	private static int cQ[] = new int[12];
	public static final Scanner sc = new Scanner(System.in);

	public static boolean isEmpty() {
		return front == -1;
	}

	public static boolean isFull() {
		return (rear + 1) % cQ.length == front;
	}

	public static void insert() {
		if (isFull())
			System.err.println("Queue is full");
		else {
			
			if (rear == -1)
				front = 0;
			
			rear = (rear + 1) % cQ.length;
			System.out.print("\nEnter data to be inserted : ");
			cQ[rear] = sc.nextInt();
			System.out.println("Data inserted succesfully");
		}
	}

	public static void delete() {
		if (isEmpty())
			System.err.println("Queue is empty");
		else {
			System.out.println("\n "+cQ[front] + " has beed Deleted!!");
			if (front == rear)
				front = rear = -1;
			else
				front = (front + 1) % cQ.length;
		}
	}

	public static void display() {
		if (isEmpty())
			System.err.println("No data in cQueue");
		else {
			for (int i = front; i != rear; i = (i + 1) % cQ.length)
				System.out.print(cQ[i]+" ");
			System.out.print(cQ[rear]);
			
		}
	}

	public static void main(String[] args) {
		delete();
		insert();
		display();
		insert();
		display();
		delete();
		insert();
		display();
		insert();
		display();
	}

}
