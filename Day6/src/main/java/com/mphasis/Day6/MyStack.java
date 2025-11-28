package com.mphasis.Day6;

import java.util.Scanner;


public class MyStack {
	private static Node top = null;
	public static Node createNode() {
		System.out.print("Enter data to be inserted : ");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		return new Node(data);
	}
	
	public static boolean isEmpty() {
		return top == null;
	}
	public static void push() {
		Node node = createNode();
		if(top == null)
			top = node;
		else {
			node.setNext(top);
			top = node;
			System.out.println("New node inserted into stack");
		}
		
	}
	public static void pop() {
		if(isEmpty())
			System.err.println("Stack Underflow");
		else {
			System.out.println(top.getData()+ " is popped");
			Node temp = top;
			top = top.getNext();
			temp.setNext(null);
		}
	}
	public static void display() {
		if(isEmpty())
			System.err.println("No Stack");
		else {
			Node temp = top;
			while(temp != null) {
				System.out.print(temp.getData()+"->");
				temp = temp.next;
			}
			System.out.print("null\n");
			
		}
	}
}
