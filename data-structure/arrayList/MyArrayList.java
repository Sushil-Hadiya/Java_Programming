package org.arrayList;

import java.util.Collection;
import java.util.Iterator;

public class MyArrayList {
	Object list[];
	int size, cap;

	public MyArrayList() {
		cap = 10;
		list = new Object[cap];
	}

	public boolean add(Object obj) {

		try {
			if (cap == size) {
				cap = cap * 3 / 2 + 1;
				Object nl[] = new Object[cap];
				for (int i = 0; i < list.length; i++) {
					nl[i] = list[i];
				}
				list = nl;
			}
			list[size++] = obj;
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean addAll(Collection<Object> c) {
		try {
			Object nl[] = c.toArray();
			for (int i = 0; i < nl.length; i++) {
				this.add(nl[i]);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clear() {
		size = 0;
		cap = 10;
		list = new Object[cap];
	}

	public boolean contain(Object obj) {
		for (int i = 0; i < list.length; i++) {
			if (obj == list[i]) {
				return true;
			}
		}
		return false;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean remove(Object obj) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == obj) {
				for (int j = i + 1; j < size; j++) {
					list[j - 1] = list[j];
				}
				size--;
				return true;
			}
		}
		return false;
	}

	public int size() {
		return size;
	}

	public Iterator<Object> iterator() {
		class MyIterator implements Iterator<Object> {
			int cursor = 0;

			@Override
			public boolean hasNext() {
				return cursor < size;
			}

			@Override
			public Object next() {
				return list[cursor++];
			}

		}
		return new MyIterator();
	}

	public Object[] toArray() {
		Object ob[] = new Object[size];
		for (int i = 0; i < ob.length; i++) {
			ob[i] = list[i];
		}
		return ob;
	}

	@Override
	public String toString() {
		String st = "[";
		int p = 0;
		for (int i = 0; i < size; i++) {
			st = st + list[i];
			if (p < size - 1) {
				st = st + ",";
				p++;
			}
		}
		return st + "]";
	}

	public static void main(String[] args) {
		MyArrayList ma = new MyArrayList();
		ma.add("Sushil");
		ma.add(13);
		ma.add(34);
		ma.add("Sushil");
		ma.add(13);
		ma.add(34);
		ma.add("Sushil");
		ma.add(13);
		ma.add(34);
		ma.add("Sushil");
		ma.add(13);
		ma.add(34);
		ma.add("Sushil");
		ma.add(13);
		ma.add(34);
		ma.add("Sushil");
		ma.add(13);
		ma.add(34);
		System.out.println(ma);
		System.out.println(ma.size());
	}

}
