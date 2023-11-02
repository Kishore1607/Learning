package ArraySums;
import java.util.Arrays;

public class SortingEvenNextOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 21, 11, 26, 75, 41, 15 };

		int l = 0;
		int r = (arr.length - 1);

		while (l < r) {
			while (arr[l] % 2 == 0) {
				l++;
			}
			while (arr[r] % 2 == 1) {
				r--;
			}
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		
		Arrays.stream(arr).forEach(System.out::println);
	}

}
