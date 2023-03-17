package com.linkedlist.practice;

public class Practice31 {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			System.out.print("->");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node first = new Node(9);
		first.next = new Node(4);
		first.next.next = new Node(6);
		System.out.print("First List is: ");
		printList(first);
		// create second list 8->4
		Node second = new Node(8);
		second.next = new Node(4);
		System.out.print("Second List is: ");
		printList(second);
		// Multiply the two lists and see result
		System.out.print("Result is: ");
		System.out.println(multiplyTwoLists(first, second));
	}

	// Multiply contents of two linked lists
	private static long multiplyTwoLists(Node first, Node second) {
		 long N = 1000000007;
		 long num1 = 0, num2 = 0;
		 while (first!=null || second!=null) {
			 if (first!=null) {
				num1=((num1)*10)%N+first.data;
				first=first.next;
			}
			 if (second!=null) {
					num2=((num2)*10)%N+second.data;
					second=second.next;
				}
			
		}
		return  ((num1%N)*(num2%N))%N;
	}
}
