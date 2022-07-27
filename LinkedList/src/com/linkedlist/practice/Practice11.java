package com.linkedlist.practice;

import java.util.HashSet;

public class Practice11 {

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
		Practice11 list = new Practice11();
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
		Node startingnode = getStartingNode(head);
		System.out.println("Starting node is : " + startingnode.data);

	}

	private static Node getStartingNode(Node head) {

		if (head == null) {
			return null;
		}
		Node slow = head;
		Node intersection = detectLoop(head);
		while (slow != intersection) {
			slow = slow.next;
			intersection = intersection.next;
		}
		return slow;

	}

	private static Node detectLoop(Node head) {
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
		return slow_p;
	}

	private void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

}
