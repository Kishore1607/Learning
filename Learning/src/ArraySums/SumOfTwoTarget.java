package ArraySums;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoTarget {

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		int[] a = {10, 15, 25, 30};
		int target = 40;
		int[] result = find(a, target);
		if (result.length == 0) {
			System.out.print("Unable to find the number.");
		}
		for (int index : result) {
			System.out.print(index + " ");
		}
	}

	public static int[] find(int[] a, int target) {
		Map<Integer, Integer> arr = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int com = target - a[i];
			if (arr.containsKey(com)) {
				int index = arr.get(com);
				return new int[] {index, i};
			}
			arr.put(a[i], i);
		}
		return new int[0];
	}

}
