package org.stack;

public class MyStack {
	Object stk[];
	int top = -1;
	int cap;

	public MyStack(int cap) {
		this.cap = cap;
		stk = new Object[cap];
	}

	public boolean push(Object obj) {
		if (top == cap - 1) {
			System.out.println("Stack is Overflow");
			return false;
		}
		stk[++top] = obj;
		return true;
	}

	public Object pop() {
		if (top == -1) {
			System.out.println("Stack is Underflow!!");
			return null;
		}
		return stk[top--];
	}

	public Object peek() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return null;
		}
		return stk[top];
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == - 1;
	}

	public int search(Object obj) {
		for (int i = 0; i < stk.length; i++) {
			if (obj == stk[i]) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		String st = "[";
		int coma = 0;
		for (int i = 0; i <= top; i++) {
			st = st + stk[i];
			if (coma < top) {
				st = st + ",";
				coma++;
			}
		}
		return st + "]";
	}

	public static void main(String[] args) {
		MyStack ms = new MyStack(5);
		System.out.println("Initial Size " + ms.size());
		ms.push(12);
		ms.push("Sushil");
		ms.push(34.43);
		ms.push(false);
		ms.push("Sushil");
		/*System.out.println("Initial Size " + ms.size());
		ms.pop();
		System.out.println("Initial Size " + ms.size());
		System.out.println(ms);
		System.out.println(ms.isEmpty());
		System.out.println(ms.search(false));
		MyStack ms1 = new MyStack(4);
		ms1.push(111);
		System.out.println(ms1.isEmpty());
		System.out.println(ms.isEmpty());*/
		System.out.println(ms);
	}
}
