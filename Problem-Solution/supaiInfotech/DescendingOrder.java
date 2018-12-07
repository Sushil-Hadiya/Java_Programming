package random;

import java.util.Comparator;

public class DescendingOrder implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2) * -1;
	}

}
