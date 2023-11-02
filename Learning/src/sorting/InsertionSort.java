package sorting;

public class InsertionSort {
	public static void merge(String[] args) {
		
		int[] a={4,5,12,8,7,6};
	     int n = a.length;
		// Insertion Sort
		int x = 0, i;
		for (int j = 1; j < n; j++) {
			x = a[j];
			i = j - 1;
			while (i >= 0 && x <= a[i])
			{
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = x;
		}
		for (int y = 0; y < n; y++)
			System.out.println(a[y]);
	}
}
