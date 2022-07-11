package com.linkedlist.practice;

public class Practice5 {
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
		//pushNode(4);
		//pushNode(5);
		//pushNode(6);
		System.out.println("Given LinkedList is ");
		print();
		findMiddleElement();

	}

	// This method will find middle element with 2 pointer
	private static Node findMiddleElement() {
		Node slow_ptr = head;
        Node fast_ptr = head;
        while (fast_ptr != null && fast_ptr.next != null)
        {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        System.out.println("The middle element is [" +
                            slow_ptr.data + "] \n");
		
		return slow_ptr;

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
