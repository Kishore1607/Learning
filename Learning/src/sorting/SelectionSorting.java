package sorting;

public class SelectionSorting {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 77, 9, 62 };

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int num = i;
			for (int j = i + 1; j < n; j++) {

				if (arr[num] > arr[j]) {
					num = j;
				}
			}

			int a = arr[i];
			arr[i] = arr[num];
			arr[num] = a;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
