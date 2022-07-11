package com.linkedlist.practice;

public class Practice4 {
	static Node head;

	// Creating a new Node
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Function to add a new Node
	public static void pushNode(int data) {

		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;

	}

	public static void main(String[] args) {

		pushNode(1);
		pushNode(2);
		pushNode(3);
		pushNode(4);
		pushNode(5);
		pushNode(6);
		System.out.println("Given LinkedList is ");
		print();
		findMiddleElement();

	}

	// This method will find middle element
	private static void findMiddleElement() {
		if (head != null) {

			int len = getListLength();
			Node temp = head;
			int middleLength = len / 2;
			while (middleLength != 0) {
				temp = temp.next;
				middleLength--;
			}
			System.out.print("The middle element is [" + temp.data + "]");
			System.out.println();
		}

	}

	// This method will calculate length of list
	private static int getListLength() {
		int length = 0;
		Node temp = head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}

		return length;
	}

	// This method will iterate whole linked list
	private static void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}

	}

}
