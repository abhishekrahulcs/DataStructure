package com.linkedlist.practice;

public class Practice6 {
	Node head;

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
		Practice6 llist = new Practice6();

		/*
		 * Constructed Linked List is 1->2->3->4->5->6-> 7->8->8->9->null
		 */
		llist.push(9);
		llist.push(8);
		llist.push(7);
		llist.push(6);
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);

		System.out.println("Given Linked List");
		llist.printList();
		
		llist.head = llist.reverse(llist.head, 3);
		
		System.out.println("Reversed list");
        llist.printList();

	}

	private Node reverse(Node head, int i) {

		if (head == null)
			return null;

		Node current = head;
		Node next = null;
		Node prev = null;

		int count = 0;
		/* Reverse first k nodes of linked list */
		while (count < i && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		/* next is now a pointer to (k+1)th node
        Recursively call for the list starting from
        current. And make rest of the list as next of
        first node */
		if (next != null)
			head.next = reverse(next, i);

		return prev;

	}

	private void printList() {
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
