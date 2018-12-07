package sortArryUsingSingleLoop;

public class SortArrayUsingSingleLoop {
	static int[] sort(int nums[]) {
		for (int i = 0; i < nums.length - 1;) {
			if (nums[i] > nums[i + 1]) {
				int temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
				i = 0;
			} else {
				i++;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int arr[] = { 100, 20, 90, 80 };
		arr = sort(arr);
		dispay(arr);
	}

	private static void dispay(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
