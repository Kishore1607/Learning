package Search;

public class OrderOfEqulibrium {
	public static void main(String[] args) {

		// 1 method

		int[] a = { 1, 0, 1, 5, 3, 2, 1, 2, 3, 5, 1, 0, 1 };
		int n = 7;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int l = 0;
			int r = 0;
			for (int j = i; j >= 0; j--) {
				l += a[j];
			}
			for (int k = i; k < n; k++) {
				r += a[k];
			}
			if (l == r && max < l) {
				max = l;
			}
		}
		System.out.print(max);

		// 2 method
		
		int l = 0;
		int r = 0;
		int max1 = 0;
		for (int i = 0; i < n; i++) {
			r += a[i];
		}
		for (int j = 0; j < n; j++) {
			l += a[j];
			if (r == l && max < r) {
				max = r;
			}
			r -= a[j];
		}
		System.out.print(max1);
	}
}
