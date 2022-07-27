package com.linkedlist.practice;

import java.util.HashSet;

public class Practice10 {

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
		Practice10 list = new Practice10();
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);

		// Making linked list circular

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;

		}

		temp.next = head;

		detectLoop(head);

	}

	private static void detectLoop(Node head) {
		Node slow_p = head, fast_p = head;
		int flag = 0;
		while (slow_p != null && fast_p != null && fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;

			if (slow_p == fast_p) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("Loop found");
		else
			System.out.println("No Loop");
	}

	private void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

}
