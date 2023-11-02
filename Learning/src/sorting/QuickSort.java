package sorting;

class QuickSort {

	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];

		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			if (arr[j] < pivot) {

				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return (i + 1);
	}

	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {

			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int N = arr.length;

		quickSort(arr, 0, N - 1);

		System.out.println("Sorted array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
