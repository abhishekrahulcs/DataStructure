package com.linkedlist.practice;



public class Practice2 {

	 static Node head;
	 static class Node{
		 int data;
		 Node next;
		 Node(int d){
			 this.data=d;
			 this.next=null;
		 }
	 }
	public static void main(String[] args) {
		
		push(20);
	    push(4);
	    push(15);
	    push(85);
	    
	    System.out.println("Given LinkedList is ");
	    print();
	    head=reverse(head);
	    System.out.println("Reverse Linked List is ");
        print();
	}

	private static Node reverse(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		/*
		 * reverse the rest list and put the first element at the end
		 */
		Node rest = reverse(head.next);

		head.next.next = head;

		head.next = null;
		/* fix the head pointer */
		return rest;
	}
	private static void print() {
		Node temp=head;
		while (temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	private static void push(int data) {
		// TODO Auto-generated method stub
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
		
	}

}
