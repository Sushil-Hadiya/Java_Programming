package org.singlelinklist;

public class SingleLinkList {
	class Node {
		Object data;
		Node next;

		Node(Object data) {
			this.data = data;
		}
	}

	Node head;

	public boolean add(Object obj) {
		Node n = new Node(obj);
		if (head == null) {
			head = n;
			return true;
		}
		Node t = head;
		while (t.next != null) {
			t = t.next;
		}
		t.next = n;
		return true;
	}

	public boolean add(Object obj, int index) {
		Node n = new Node(obj);
		Node t = head;
		int i = 0;
		while (t.next != null) {
			i++;
			if (i == index) {
				break;
			}
			t = t.next;
		}
		n.next = t.next;
		t.next = n;
		return true;
	}

	public boolean addFirst(Object obj) {
		Node n = new Node(obj);
		n.next = head;
		head = n;
		return true;
	}

	public boolean addLast(Object obj) {
		Node n = new Node(obj);
		Node t = head;
		while (t.next != null) {
			t = t.next;
		}
		t.next = n;
		return true;
	}

	public boolean removeFirst() {
		if (head == null) {
			System.out.println("List is Empty");
			return false;
		}
		head = head.next;
		return true;
	}

	public boolean removeLast() {
		Node t = head;
		Node prev = null;
		if (t == null) {
			System.out.println("List is Empty");
			return false;
		}
		while (t.next != null) {
			prev = t;
			t = t.next;
		}
		prev.next = null;
		return true;
	}

	public void reverseList() {
		Node currNode = head;
		Node nextNode = null;
		Node prevNode = null;

		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
		System.out.println("Reverse Through Iteration \n");
		display(head);
	}

	private void display(Node head) {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + ",");
			currNode = currNode.next;
		}
	}

	@Override
	public String toString() {
		String st = "";
		Node t = head;
		while (t != null) {
			st = st + t.data + "->";
			t = t.next;
		}
		return st;
	}

	public static void main(String[] args) {
		SingleLinkList sl = new SingleLinkList();
		sl.add("Happy");
		sl.add("Independence");
		sl.add("Day");
		System.out.println(sl);
		sl.addFirst("First");
		System.out.println(sl);
		sl.addLast("Last");
		System.out.println(sl);
		sl.addLast(72);
		System.out.println(sl);
		sl.addFirst("FirstOfFirst");
		System.out.println(sl);
		sl.removeFirst();
		System.out.println(sl);
		sl.removeLast();
		System.out.println(sl);
		sl.removeLast();
		System.out.println(sl);
		sl.add("India", 2);
		System.out.println(sl);
		sl.reverseList();
		System.out.println();
		System.out.println(sl);
	}
}
