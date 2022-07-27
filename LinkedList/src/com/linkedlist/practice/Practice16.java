package com.linkedlist.practice;

public class Practice16 {

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

		Practice16 list = new Practice16();
		list.push(11);
		list.push(20);
		list.push(13);
		list.push(11);
		list.push(13);
		list.push(11);

		System.out.println("List before removal of duplicates");
		list.printList();

		System.out.println("List after removal of elements");
		list.removeDuplicates();
		list.printList();

	}

	// This function removes duplicate recursively
	private void removeDuplicates() {

		/*
		 * Pointer to store the pointer of a node to be deleted
		 */
		Node ptr1 = null, ptr2 = null, dup = null;
		ptr1 = head;
		/* Pick elements one by one */
		while (ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;

			/*
			 * Compare the picked element with rest of the elements
			 */
			while (ptr2.next != null) {
				if (ptr1.data == ptr2.next.data) {

					/*
					 * sequence of steps is important here
					 */
					ptr2.next = ptr2.next.next;
					System.gc();
				} else /* This is tricky */ {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;

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
