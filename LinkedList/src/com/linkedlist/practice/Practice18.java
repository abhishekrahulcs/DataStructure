package com.linkedlist.practice;

public class Practice18 {

	static Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
		 Node() {}
	}

	public static void main(String[] args) {

		Practice18 llist = new Practice18();
		llist.push(0);
		llist.push(1);
		llist.push(0);
		llist.push(2);
		llist.push(1);
		llist.push(1);
		llist.push(2);
		llist.push(1);
		llist.push(2);
		llist.printList();
		head = sortList(head);
		llist.printList();
	}

	public static Node sortList(Node head) {
		// base case
		if (head == null || head.next == null) {
			return head;
		}

		int zeroCount = 0;
		int oneCount = 0;
		int twoCount = 0;
		Node temp = head;
		while (temp != null) {
			if (temp.data == 0) {
				zeroCount++;
			} else if (temp.data == 1) {
				oneCount++;
			} else if (temp.data == 2) {
				twoCount++;
			}
			temp=temp.next;
		}
		temp=head;
		while (temp!=null) {
			if (zeroCount!=0) {
				temp.data=0;
				zeroCount--;
			}else if(oneCount!=0) {
				temp.data=1;
				oneCount--;
			}else if (twoCount!=0) {
				temp.data=2;
				twoCount--;
			}
			temp=temp.next;
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
