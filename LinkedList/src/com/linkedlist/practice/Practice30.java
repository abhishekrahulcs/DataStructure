package com.linkedlist.practice;

public class Practice30 {

	Node head;

	class Node {
		int data;
		Node right, down;

		public Node(int data) {
			this.data = data;
			right = null;
			down = null;
		}
	}

	public static void main(String[] args) {
     Practice30 L=new Practice30();
     /* Let us create the following linked list
     5 -> 10 -> 19 -> 28
     |    |     |     |
     V    V     V     V
     7    20    22    35
     |          |     |
     V          V     V
     8          50    40
     |                |
     V                V
     30               45
    */
     L.head = L.push(L.head, 30);
     L.head = L.push(L.head, 8);
     L.head = L.push(L.head, 7);
     L.head = L.push(L.head, 5);

     L.head.right = L.push(L.head.right, 20);
     L.head.right = L.push(L.head.right, 10);

     L.head.right.right = L.push(L.head.right.right, 50);
     L.head.right.right = L.push(L.head.right.right, 22);
     L.head.right.right = L.push(L.head.right.right, 19);

     L.head.right.right.right = L.push(L.head.right.right.right, 45);
     L.head.right.right.right = L.push(L.head.right.right.right, 40);
     L.head.right.right.right = L.push(L.head.right.right.right, 35);
     L.head.right.right.right = L.push(L.head.right.right.right, 20);

     // flatten the list
     L.head = L.flatten(L.head);

     L.printList();
	}

	private Node flatten(Node root) {
		if (root == null || root.right == null)
			return root;
		// recur for list on right
		root.right = flatten(root.right);

		// now merge
		root = merge(root, root.right);

		// return the root
		// it will be in turn merged with its left
		return root;

	}
	 // An utility function to merge two sorted linked lists
	private Node merge(Node root, Node right) {
		 // if first linked list is empty then second
        // is the answer
        if (root == null)     return right;
  
        // if second linked list is empty then first
        // is the result
        if (right == null)      return root;
        

        // compare the data members of the two linked lists
        // and put the larger one in the result
        Node result;
        if (root.data < right.data)
        {
            result = root;
            result.down =  merge(root.down, right);
        }
  
        else
        {
            result = right;
            result.down = merge(root, right.down);
        }
  
        result.right = null; 
        return result;
	}

	/*
	 * Utility function to insert a node at beginning of the linked list
	 */
	private Node push(Node headref, int data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(data);
		/* 3. Make next of new Node as head */
		new_node.down = headref;
		/* 4. Move the head to point to new Node */
		headref = new_node;
		/* 5. return to link it back */
		return headref;

	}
	void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.down;
        }
        System.out.println();
    }
}
