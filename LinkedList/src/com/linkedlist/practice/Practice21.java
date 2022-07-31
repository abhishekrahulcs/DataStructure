package com.linkedlist.practice;

import java.util.Stack;

public class Practice21 {
	class Node {
		int data;
		Node next;

		Node(int i) {
			this.data = i;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Practice21 p = new Practice21();
		Node head = p.new Node(1);
		head.next = p.new Node(2);
		head.next.next = p.new Node(3);
		head.next.next.next = p.new Node(2);
		head.next.next.next.next = p.new Node(1);

		if (isPalindrome(head)) {
			System.out.println("Linked List is a palindrome.");
		} else {
			System.out.println("Linked List is not a palindrome.");
		}
	}

	private static boolean isPalindrome(Node head) {

		// construct empty stack
		Stack<Integer> stack = new Stack<Integer>();

		// push all elements of the linked list into the stack
		Node node = head;
		while (node != null) {
			stack.push(node.data);
			node = node.next;
		}
		// traverse the linked list again
		node = head;

		while (node != null) {
			// pop the top element from the stack
			int top = stack.pop();

			// compare the popped element with the current node's data
			// return false if mismatch happens
			if (top != node.data) {
				return false;
			}

			// advance to the next node
			node = node.next;
		}
		// we reach here only when the linked list is a palindrome
		return true;
	}

}
