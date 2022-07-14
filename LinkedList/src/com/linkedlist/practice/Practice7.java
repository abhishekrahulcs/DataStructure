package com.linkedlist.practice;

public class Practice7 {

	static Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice7 list = new Practice7();
		for (int i = 20; i > 0; i--) {
			list.push(i);
		}
		System.out.println("Given Linked List :");
		list.printList(head);
		head = list.kAltReverse(head, 3);
		System.out.println("");
		System.out.println("Modified Linked List :");
		list.printList(head);

	}

	/*
	 * Reverses alternate k nodes and returns the pointer to the new head node
	 */
	private Node kAltReverse(Node head, int i) {
		Node current = head;
		Node prev = null;
		Node next = null;
		int count = 0;
		// Reverse first k nodes of the Linked List
		while (current != null && count < i) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;

		}
		/*
		 * 2) Now head points to the kth node. So change next of head to (k+1)th node
		 */
		if (head != null) {
			head.next = current;
		}
		/*
		 * 3) We do not want to reverse next k nodes. So move the current pointer to
		 * skip next k nodes
		 */
		count = 0;
		while (count < i - 1 && current != null) {
			current = current.next;
			count++;
		}
		/*
		 * 4) Recursively call for the list starting from current->next. And make rest
		 * of the list as next of first node
		 */
		if (current != null) {
			current.next = kAltReverse(current.next, i);
		}
		return prev;
	}

	private void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	private void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

}
