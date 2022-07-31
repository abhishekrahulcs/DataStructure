package com.linkedlist.practice;

public class Practice23 {
	class Node {
		char data;
		Node next;

		Node(char i) {
			this.data = i;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Practice23 p = new Practice23();
		Node head = p.new Node('A');
		head.next = p.new Node('B');
		head.next.next = p.new Node('C');
		head.next.next.next = p.new Node('B');
		head.next.next.next.next = p.new Node('A');

		if (isPalindrome(head)) {
			System.out.println("Linked List is a palindrome.");
		} else {
			System.out.println("Linked List is not a palindrome.");
		}
	}

	// Function to check if a given linked list of characters is a palindrome
	private static boolean isPalindrome(Node head) {
		// construct string 's1' and 's2' with consecutive elements of the linked list
		// starting from the beginning and the end

		StringBuilder s1 = new StringBuilder(), s2 = new StringBuilder();
		construct(head, s1, s2);

		return s1.toString().equals(s2.toString());
	}
	// Construct 's1' and 's2' out of the given linked list with consecutive
    // list elements in the forward and backward direction
	private static void construct(Node head, StringBuilder s1, StringBuilder s2) {

		// base case
		if (head == null) {
			return;
		}

		s1.append(head.data);
		construct(head.next, s1, s2);
		s2.append(head.data);
	}

}
