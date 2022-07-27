package com.linkedlist.practice;

public class Practice13 {

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
		Practice13 list = new Practice13();
		list.push(20);
		list.push(13);
		list.push(13);
		list.push(11);
		list.push(11);
		list.push(11);

		System.out.println("List before removal of duplicates");
		list.printList();

		list.removeDuplicates();

		System.out.println("List after removal of elements");
		list.printList();

	}

	private void removeDuplicates() {
		// Another reference to head
		Node curr = head;

		// Traverse node till last node
		while (curr != null) {
			Node temp = curr;
			/*
			 * Compare current node with the next node and keep on deleting them until it
			 * matches the current node data
			 */
			
			while (temp != null && temp.data==curr.data) {
                  temp=temp.next;
			}
			 /*Set current node next to the next different
            element denoted by temp*/
            curr.next = temp;
            curr = curr.next;
		} 

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
