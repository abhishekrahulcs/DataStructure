package com.linkedlist.practice;

public class Practice1 {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}

		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice1 list = new Practice1();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		System.out.println("Given LinkedList is: ");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);

	}

	private void printList(Node node) {
		// TODO Auto-generated method stub
		while (node != null) {
			System.out.println(node.data + " ");
			node = node.next;
		}
	}

}
