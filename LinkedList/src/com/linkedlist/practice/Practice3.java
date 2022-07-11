package com.linkedlist.practice;

public class Practice3 {
     
	 static Node head;
	 static class Node{
		 int data;
		 Node next;
		 Node(int data){
			 this.data=data;
			 this.next=null;
		 }
	 } 
	private static void push(int data) {
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	public static void main(String[] args) {
		push(20);
	    push(4);
	    push(15);
	    push(85);
	    
	    System.out.println("Given LinkedList is ");
	    print();
	    reverse(head);
	    System.out.println("Reverse Linked List is ");
        print();
	}
	private static Node reverse(Node head) {
		Node curr=head;
		Node prev=null;
		reverseList(head,curr,prev);
		return head;
	}
	private static void reverseList(Node head, Node curr, Node prev) {
		//Base case 
		if (curr==null) {
			head=prev;
			return;
		}
		
		Node forward=curr.next;
		reverseList(head, forward, curr);
		curr.next=prev;
		
	}
	private static void print() {
		Node temp=head;
		while (temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		
	}

}
