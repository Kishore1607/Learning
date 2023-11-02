package ArraySums;

public class GoodNumberOrNot {
	public static void main(String[] args) {
		int[] arr = { 5000, 10, 8, 9 };
		
		// finding max value
		
		int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // max cube root
        double num = Math.cbrt(max);
        int n = (int) num + 1;
        
		boolean[] ans = value(arr, n);
		for (boolean i : ans) {
			System.out.println(i);
		}
	}
	

	static boolean[] value(int[] arr, int n) {
		int[] cube = new int[n];
		for (int i = 0; i < n; i++) {
			int c = i + 1;
			cube[i] = c * c * c;
		}

		int m = arr.length;
		boolean[] result = new boolean[m];

		for (int i = 0; i < m; i++) {
			int l = 0, r = m - 1;
			while (l <= r) {
				if (cube[l] == arr[i]) {
					result[i] = true;
					break;
				} else if (cube[r] == arr[i]) {
					result[i] = true;
					break;
				} else if (cube[l] + cube[r] == arr[i]) {
					result[i] = true;
					break;
				} else if (cube[l] + cube[r] > arr[i]) {
					r--;
				} else {
					l++;
				}
			}
		}
		return result;
	}
}
