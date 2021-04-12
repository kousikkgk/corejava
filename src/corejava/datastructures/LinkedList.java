package corejava.datastructures;

public class LinkedList {
	Node head;

	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		// Checking for first object
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			// Jumping nodes
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	public void show() {
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		
		//Print last element
		System.out.println(node.data);
		
	}
}
