package ArraySums;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumXY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		List<String> arr2 = new ArrayList<>(Arrays.asList("x", "y", "x", "y"));

		int i = 0;
		int j = 0;

		while (arr1.size() > 1) {
			if (i == arr1.size()) {
				i = 0;
			}
			if (j == arr2.size()) {
				j = 0;
			}
			System.out.println(arr1.get(i) + ": " + arr2.get(j));
			if (arr2.get(j).equals("y")) {
				arr1.remove(i);
				i--;
			}
			i++;
			j++;
		}
		System.out.print(arr1.get(0));
	}

}
