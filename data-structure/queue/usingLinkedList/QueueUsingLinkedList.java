package org.queue.usingLinkedList;

public class QueueUsingLinkedList {
	class Node {
		Object data;
		Node rear;
		Node front;

		public Node(Object data) {
			this.data = data;
		}

	}

	Node head;

	public boolean enQueue(Object obj) {
		Node n = new Node(obj);
		if (head == null) {
			head = n;
			return true;
		}
		Node t = head;
		while (t.rear != null) {
			t = t.rear;
		}
		t.rear = n;
		return true;
	}

	public boolean remove() {
		if (head == null) {
			System.out.println("Queue is Empty");
			return false;
		}
		Node t = head;
		while (t.front != null) {
			t = t.front;
		}
		t.front = t.rear;
		return true;
	}

	public static void main(String[] args) {
		QueueUsingLinkedList ql = new QueueUsingLinkedList();
		System.out.println(ql.enQueue(23));
		System.out.println(ql.enQueue(34));
	}
}
