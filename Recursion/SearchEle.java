package recursion;

public class SearchEle {
	static int search(int ar[], int ele, int index) {
		if (index >= ar.length) {
			return -1;
		}
		if (ar[index] == ele) {
			return index;
		}
		return search(ar, ele, index + 1);
	}

	public static void main(String[] args) {
		int ar[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int ele = 11;
		int res = search(ar, ele, 0);
		if (res != -1) {
			System.out.println("Element found");
		} else {
			System.out.println("Not Found");
		}
	}
}
