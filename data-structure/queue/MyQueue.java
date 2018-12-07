package org.queue;

public class MyQueue {
	Object que[];
	int front, rear, cap;

	public MyQueue(int cap) {
		this.cap = cap;
		que = new Object[cap];
		front = rear = -1;
	}

	public boolean enQueue(Object obj) {
		if (rear == cap - 1) {
			System.out.println("Queue is overflow!!!");
			return false;
		}
		if (front == -1) {
			front = 0;
		}
		que[++rear] = obj;
		return true;
	}

	public Object deQueue() {
		if (front == -1 || front > rear) {
			System.out.println("Queue is Underflow!!!");
			front = rear = -1;
			return null;
		}
		return que[front++];
	}

	public int size() {
		if (front == -1) {
			return 0;
		}
		return rear - front + 1;
	}

	@Override
	public String toString() {
		String st = "[";
		int flag = 0;
		for (int i = front; i <= rear; i++) {
			st = st + que[i];
			if (flag < rear -1) {
				st = st + ",";
				flag++;
			}
		}
		return st + "]";
	}

	public static void main(String[] args) {
		MyQueue mq = new MyQueue(3);
		mq.enQueue(12);
		mq.enQueue(34);
		mq.enQueue(45);
		mq.deQueue();
		System.out.println(mq.size());
		System.out.println(mq);
	}
}
