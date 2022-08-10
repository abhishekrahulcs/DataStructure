package com.linkedlist.practice;

public class Practice25 {
	// Structure of LinkedList Node
	static class Node {
		int data;
		Node next;
		Node random;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.random = null;
		}
	}

	// Utility function to print the list.
	static void print(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println("Data = " + temp.data + ", Random = " + temp.random.data);
			temp = temp.next;
		}

	}

	// This function clones a given
	// linked list in O(1) space
	static Node clone(Node head) {
		// step 1: Create a Clone List
		Node cloneHead = null;
		Node cloneTail = null;

		Node temp = head;
		while (temp != null) {
			insertAtTail(cloneHead, cloneTail, temp.data);
			temp = temp.next;
		}

		// step 2: insert nodes of Clone List in between originalList
		Node originalNode = head;
		Node cloneNode = cloneHead;

		while (originalNode != null && cloneNode != null) {
			Node next = originalNode.next;
			originalNode.next = cloneNode;
			originalNode = next;

			next = cloneNode.next;
			cloneNode.next = originalNode;
			cloneNode = next;
		}
		
		 // step 3: Random pointer copy
		
			originalNode = head;
			cloneNode = cloneHead;
			while (originalNode != null && cloneNode != null) {

				if (originalNode.random != null) {
					cloneNode.random = originalNode.random.next;
				} else {
					cloneNode.random = null;
				}

				cloneNode = cloneNode.next;
				originalNode = originalNode.next;
			}

			//step 4: revert step 2 changes
			Node original = head;
			Node copy = cloneHead;

			while (original != null && copy != null) {
				original.next = copy.next;
				original = original.next;
				if (original != null) {
					copy.next = original.next;
				}
				copy = copy.next;
			}
			return copy;

		}

	private static void insertAtTail(Node cloneHead, Node cloneTail, int data) {
		Node newNode = new Node(data);
		if (cloneHead == null) {
			cloneHead = newNode;
			cloneTail = newNode;
		} else {
			cloneTail.next = newNode;
			cloneTail = newNode;
		}
	}

	public static void main(String[] args) {
		Node start = new Node(1);
		start.next = new Node(2);
		start.next.next = new Node(3);
		start.next.next.next = new Node(4);
		start.next.next.next.next = new Node(5);

		// 1's random points to 3
		start.random = start.next.next;

		// 2's random points to 1
		start.next.random = start;

		// 3's and 4's random points to 5
		start.next.next.random = start.next.next.next.next;
		start.next.next.next.random = start.next.next.next.next;

		// 5's random points to 2
		start.next.next.next.next.random = start.next;

		System.out.println("Original list : ");
		print(start);
		System.out.println("Cloned list : ");
		Node cloned_list = clone(start);
		print(cloned_list);
	}
}
