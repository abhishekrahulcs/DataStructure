package com.linkedlist.practice;

import java.util.HashMap;

public class Practice14 {

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
		
		Practice14 list = new Practice14();
		list.push(20);
		list.push(13);
		list.push(13);
		list.push(11);
		list.push(11);
		list.push(11);

		System.out.println("List before removal of duplicates");
		list.printList();
	
		System.out.println("List after removal of elements");
		list.removeDuplicates();

	}

	private void removeDuplicates() {
		Node temp = head;
		HashMap<Integer, Boolean> track = new HashMap<Integer, Boolean>();
		while (temp != null) {
			if (!track.containsKey(temp.data)) {
				System.out.print(temp.data + " ");
			}
			track.put(temp.data, true);
			temp = temp.next;
		}

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
