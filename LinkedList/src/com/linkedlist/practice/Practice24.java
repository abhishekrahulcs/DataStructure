package com.linkedlist.practice;

public class Practice24 {
	static Node head1;
	static Node head2;
	static Node result;
	    int carry;
	class Node {
		int data;
		Node next;

		Node(int data,Node next) {
			this.data = data;
			this.next = null;
		}
		
	}

	public static void main(String[] args) {
		Practice24 list=new Practice24();
		
        list.head1 = null;
        list.head2 = null;
        list.result = null;
        list.carry = 0;
        int arr1[] = { 9, 9, 9 };
        int arr2[] = { 1, 8 };
 
        // Create first list as 9->9->9
        for (int i = arr1.length - 1; i >= 0; --i)
            list.push(arr1[i], 1);
 
        // Create second list as 1->8
        for (int i = arr2.length - 1; i >= 0; --i)
            list.push(arr2[i], 2);
        list.printList(head1);
        list.printList(head2);
        result=list.addTwoList(head1,head2);
        list.printList(result);
	}
	/* A utility function to push a value to linked list */
    void push(int val, int list)
    {
    	Practice24 l=new Practice24();
        Node newnode = l.new Node(val,null);
        if (list == 1)
        {
            newnode.next = head1;
            head1 = newnode;
        }
        else if (list == 2)
        {
            newnode.next = head2;
            head2 = newnode;
        }
        else
        {
            newnode.next = result;
            result = newnode;
        }
 
    }

	private void printList(Node addTwoList) {
		Node ptr = addTwoList;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
 
        System.out.println("null");
	}

	public Node addTwoList(Node first, Node second) {
		// step 1 - reverse input LL
		first = reverse(first);
		second = reverse(second);

		// step2 - add 2 LL
		Node ans = add(first, second);

		// step 3
		ans = reverse(ans);

		return ans;

	}

	private Node add(Node first, Node second) {
		int carry = 0;

		Node ansHead = null;
		Node ansTail = null;
		while (first != null || second != null || carry != 0) {
			int val1 = 0;
			if (first != null)
				val1 = first.data;

			int val2 = 0;
			if (second != null)
				val2 = second.data;

			int sum = carry + val1 + val2;

			int digit = sum % 10;
			// create node and add in answer Linked List
			insertAtTail(ansHead, ansTail, digit);
			carry = sum / 10;
			if (first != null)
				first = first.next;

			if (second != null)
				second = second.next;

		}
		return ansHead;
	}

	private void insertAtTail(Node ansHead, Node ansTail, int digit) {
		Node temp = new Node(digit,null);
		// empty list
		if (ansHead == null) {
			ansHead = temp;
			ansTail = temp;
			return;
		} else {
			ansTail.next = temp;
			ansTail = temp;
		}

	}

	private Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
