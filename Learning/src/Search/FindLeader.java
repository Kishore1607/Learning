package Search;

public class FindLeader {

	public static void main(String[] args) {

		// 1 method O(n^2)
		String s = "";
		int[] a = { 2, 8, 7, 3, 5, 3, 1 };
		int n = 6;
		for (int i = 0; i < n; i++) {
			int f = 0;
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					f--;
				}
			}
			if (f == 0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.print(a[n]);
		

		System.out.println();
		
		// 2 method O(n)
		int max = n;
		System.out.print(a[n] + " ");
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] > a[max]) {
				System.out.print(a[i] + " ");
				max = i;
			}
		}
	}
}
