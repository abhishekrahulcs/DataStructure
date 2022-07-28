package com.linkedlist.practice;


public class Practice20 {

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

	private static Node sortedMerge(Node a, Node b) {

        // a dummy first node to hang the result on
        Node dummy = new Node();
 
        // points to the last result node — so `tail.next` is the place
        // to add new nodes to the result.
        Node tail = dummy;
 
        while (true)
        {
            // if either list runs out, use the other list
            if (a == null)
            {
                tail.next = b;
                break;
            }
            else if (b == null)
            {
                tail.next = a;
                break;
            }                                                              
 
            if (a.data <= b.data)
            {
                if (a != null)
                {
                    Node newNode = a;
                    a = a.next;
 
                    newNode.next = tail.next;
                    tail.next = newNode;
                }
            }
            else {
                if (b != null)
                {
                    Node newNode = b;
                    b = b.next;
 
                    newNode.next = tail.next;
                    tail.next = newNode;
                }
            }
            tail = tail.next;
        }
 
        return dummy.next;
	}

	        
	   
	}


