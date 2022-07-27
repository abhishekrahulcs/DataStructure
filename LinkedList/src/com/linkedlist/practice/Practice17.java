package com.linkedlist.practice;

public class Practice17 {

	static Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
		 Node() {}
	}

	public static void main(String[] args) {

		Practice17 llist = new Practice17();
		llist.push(0);
		llist.push(1);
		llist.push(0);
		llist.push(2);
		llist.push(1);
		llist.push(1);
		llist.push(2);
		llist.push(1);
		llist.push(2);
		llist.printList();
		head = sortList(head);
		llist.printList();
	}

	public static Node sortList(Node head) {
		// base case
		if (head == null || head.next == null) {
			return head;
		}

		// maintain dummy nodes

		// maintain three dummy nodes
		Practice17 li = new Practice17();
		Node first = li.new Node(), second = li.new Node(), third = li.new Node();

		// maintain three references
		Node zero = first, one = second, two = third;

		// traverse the list
		Node curr = head;
		while (curr != null) {
			if (curr.data == 0) {
				zero.next = curr;
				zero = zero.next;
			} else if (curr.data == 1) {
				one.next = curr;
				one = one.next;
			} else if (curr.data == 2) {
				two.next = curr;
				two = two.next;
			}
			curr = curr.next;
		}
		// combine lists containing 0's, 1's, and 2's
		zero.next = (second.next != null) ? (second.next) : (third.next);
		one.next = third.next;
		two.next = null;
		// change head
		return first.next;

	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
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
