package com.linkedlist.practice;

public class Practice22 {
	class Node {
		int data;
		Node next;

		Node(int i) {
			this.data = i;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Practice22 p = new Practice22();
		Node head = p.new Node(1);
		head.next = p.new Node(2);
		head.next.next = p.new Node(3);
		head.next.next.next = p.new Node(3);
		head.next.next.next.next = p.new Node(2);
		head.next.next.next.next .next= p.new Node(1);

		if (isPalindrome(head)) {
			System.out.println("Linked List is a palindrome.");
		} else {
			System.out.println("Linked List is not a palindrome.");
		}
	}

	private static boolean isPalindrome(Node head) {

		if (head.next == null) {
			return true;
		}
		// step 1 -> find Middle
		Node middle = getMid(head);
		
		// step2 -> reverse List after Middle
		Node temp = middle.next;
		middle.next = reverse(temp);
		
		// step3 - Compare both halves
		Node head1 = head;
		Node head2 = middle.next;
		while (head2 != null) {
			if (head2.data != head1.data) {
				return false;
			}
			head1 = head1.next;
			head2 = head2.next;
		}
		
		return true;
	}

	private static Node reverse(Node head) {
		
		Node prev = null;
		Node curr = head;
		Node next = null;
	    while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		return prev;
	}

	private static Node getMid(Node head) {
		Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow;
	}

}
