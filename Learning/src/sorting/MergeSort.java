package sorting;

public class MergeSort {
	public static void merge(int[] a, int start, int mid, int end) {
		int i = start;
		int j = mid + 1;
		int k = start;
		int arr[] = new int[end + 1];
		while (i <= mid && j <= end) {
			if (a[i] < a[j]) {
				arr[k] = a[i];
				i++;
			} else {
				arr[k] = a[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			arr[k++] = a[i++];
		}
		while (j <= end) {
			arr[k++] = a[j++];
		}

		for (int y = start; y <= end; y++) {
			a[y] = arr[y];
		}

	}

	public static void merge_sort(int[] a, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			merge_sort(a, mid + 1, end);
			merge_sort(a, start, mid);
			merge(a, start, mid, end);
		}
	}

	public static void main(String[] args) {

		int[] a = { 4, 5, 12, 8, 7, 6 };
		int n = a.length;

//      Merge Sort

		merge_sort(a, 0, n - 1);
		for (int y = 0; y < n; y++)
			System.out.println(a[y]);
	}
}
