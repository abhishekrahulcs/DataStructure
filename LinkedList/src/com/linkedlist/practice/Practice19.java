package com.linkedlist.practice;

class Node {
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	Node() {
	}
}

public class Practice19 {

	public static void printList(String msg, Node head) {
		System.out.print(msg);

		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " —> ");
			ptr = ptr.next;
		}

		System.out.println("null");
	}

	public static void main(String[] args) {

		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6, 7 };

		Node first = null, second = null;
		for (int i = keys.length - 1; i >= 0; i = i - 2) {
			first = new Node(keys[i], first);
		}

		for (int i = keys.length - 2; i >= 0; i = i - 2) {
			second = new Node(keys[i], second);
		}

		// print both lists
		printList("First List: ", first);
		printList("Second List: ", second);

		Node head = sortedMerge(first, second);
		printList("After Merge: ", head);

	}

	private static Node sortedMerge(Node first, Node second) {
		// TODO Auto-generated method stub
		if (first == null) {
			return second;
		}
		if (second == null) {
			return first;
		}

		if (first.next == null) {
			first.next = second;
			return first;
		}
		if (first.data <= second.data) {
			solve(first, second);
		} else {
			solve(second, first);
		}
		return first;
	}

	private static void solve(Node first, Node second) {
		 
	    Node curr1 = first;
	    Node next1 = curr1.next;
	    
	    Node curr2 = second;
	    Node next2 = curr2.next;
	    while(next1 != null && curr2 != null) {
	        
	        if( (curr2.data >= curr1.data ) 
	           && ( curr2.data <= next1.data)) {
	            
	            curr1.next = curr2;
	            curr2.next = next1;
	            curr1 = curr2;
	            curr2 = next2;
	        }
	        else {
	            curr1=next1;
	            next1=next1.next;
	            if (next1==null) {
					curr1.next=curr2;
					
				}
	        }
	        
	        
	    }
		
	}

}
