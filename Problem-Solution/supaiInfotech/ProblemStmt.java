package random;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ProblemStmt {
	public static void sort(String str, int val) {
		String repl = str.replaceAll(";", " ").replaceAll("\\.", " ").replaceAll(",", " ").replaceAll(" +", " ");
		String lower = repl.toLowerCase();
		String arry[] = lower.split(" ");
		TreeMap<String, Integer> map = new TreeMap<>();

		int n = arry.length;
		for (int i = 0; i < n; i++) {
			int inc = 1;
			for (int j = i + 1; j < n; j++) {
				if (arry[i].equals(arry[j])) {
					arry[j] = arry[n - 1];
					n--;
					j--;
					inc++;
				}
			}
			if (inc != 1) {
				map.put(arry[i], inc);
			} else {
				map.put(arry[i], 1);
			}
		}

		if (val == 0) {
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
				System.out.println(entry.getKey() + "      " + entry.getValue());
			}
		}
		if (val == 1) {
			Map<Integer, String> rev = new TreeMap<>(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o1.compareTo(o2) * -1;
				}
			});
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
				int key = entry.getValue();
				String value = entry.getKey();
				rev.put(key, value);
			}
			Set<Entry<Integer, String>> newEntry = rev.entrySet();
			for (Entry<Integer, String> entry : newEntry) {
				System.out.println(entry.getValue() + "      " + entry.getKey());
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		System.out.println("Enter 0 OR 1");
		int decision = sc.nextInt();
		sort(str, decision);
		sc.close();
	}
}
