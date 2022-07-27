package com.linkedlist.practice;

import java.util.HashMap;

public class Practice15 {

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
		
		Practice15 list = new Practice15();
		list.push(20);
		list.push(13);
		list.push(13);
		list.push(11);
		list.push(11);
		list.push(11);

		System.out.println("List before removal of duplicates");
		list.printList();
	
		System.out.println("List after removal of elements");
		list.removeDuplicates(head);
		list.printList();

	}

	//This function removes duplicate recursively
	private Node removeDuplicates(Node head) {
		
		 /* Pointer to store the pointer
	    of a node to be deleted*/
		
		Node to_free;
		
		//do nothing
		if (head==null) {
			return null;
		}
		   /* Traverse the list till last node */
		if (head.next!=null) {
			  /* Compare head node with next node */
			if (head.data==head.next.data) {
				to_free=head.next;
				head.next=head.next.next;
				removeDuplicates(head);
			}else {
				
				 /* This is tricky: only advance if no deletion */
				removeDuplicates(head.next);
			}
		}
		return head;
		
	
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
