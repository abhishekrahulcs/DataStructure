package com.linkedlist.practice;

public class Practice28 {
	static Node head;

	// Structure of LinkedList Node
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;

		}
	}

	// Utility function to print the list.
	private void print(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}

	}

	
	public static void main(String[] args) {
		Node start = new Node(2);
		start.next = new Node(1);
		start.next.next = new Node(5);
		start.next.next.next = new Node(4);
		start.next.next.next.next = new Node(3);

		start.next.next.next.next.next = new Node(13);

		Practice28 li = new Practice28();
		li.print(start);
		head = li.mergeSort(start);
		System.out.println("\nSorted Linked List is: \n");
		li.print(head);

	}


	private Node mergeSort(Node head) {
		
		//Base case
		if (head == null || head.next == null) {
            return head;
		}
    
		//split linkedlist in two halves
		Node mid=findMid(head);
	
		Node left=head;
		Node right=mid.next;
		mid.next=null;
		
		 //recursive calls to sort both halves
		left=mergeSort(left);
		right=mergeSort(right);
		
		 //merge both left and right halves
		Node result=merge(left,right);
		return result;
		
	}


	private Node merge(Node left, Node right) {
		Node ans = null;
		if (left == null) {
			return right;
		}
		if (right == null) {
			return left;
		}

		if (left.data <= right.data) {
			ans = left;
			ans.next = merge(left.next, right);
		} else {
			ans = right;
			ans.next = merge(left, right.next);

		}
		return ans;
	}

	private Node findMid(Node head) {
		Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
