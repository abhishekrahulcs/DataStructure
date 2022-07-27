package com.linkedlist.practice;

import java.util.HashSet;

public class Practice9 {

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
		Practice9 list = new Practice9();
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
		
		if (detectLoop(head))
			System.out.println("Loop found");
		else
			System.out.println("No Loop");

	}

	 // Returns true if there is a loop in linked
    // list else returns false.
	private static boolean detectLoop(Node head) {
     
		HashSet<Node> s=new HashSet<Node>();
		
		while (head!=null) {
			// If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
			if (s.contains(head)) {
				return true;
			}
			s.add(head);
			head=head.next;
			
		}
		return false;
	}



	private void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

}
