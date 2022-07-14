package com.linkedlist.practice;

public class Practice8 {

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
		Practice8 list = new Practice8();
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		System.out.print(isCircular(head) ? "Yes\n" : "No\n");
        
        // Making linked list circular
		
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
			
		}
		
			temp.next=head;
		
	

		 //head.next.next.next.next = head;
		System.out.print(isCircular(head) ? "Yes\n" : "No\n");

	}

	private static boolean isCircular(Node head) {
	
		
		// Base condition if head==null then return true
		if (head==null) {
			return true;
		}
		
		//Next of head
		Node temp=head.next;
		
		//// This loop would stop in both cases (1) If
	    // Circular (2) Not circular
		while (temp!=null && temp!=head) {
			temp=temp.next;		

		}
		
		if (temp==head) {
			return true;
		}
		
		
		return false;
	}


	private void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

}
