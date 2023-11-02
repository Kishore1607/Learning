package ArraySums;

public class ChangesDistribution {
	public static void main(String[] args) {
		int[] arr = { 30, 120, 30, 60, 30, 120 };
		int low = 0;
		int mid = 0;
		int f = 0;

		for (int i = 0; i < arr.length; i++) {
			int am = arr[i] / 30;
			if (am == 1) {
				low++;
			} else if (am == 2) {
				if (low == 0) {
					f = 1;
				} else {
					mid++;
					low--;
				}
			} else if (am == 3) {
				if (low > 0 && mid > 0) {
					low--;
					mid--;
				}
				if (low > 3) {
					low -= 3;
				}
				f = 1;
			}
			if (f == 1) {
				System.out.print("Transaction Failed");
				break;
			}
		}
		if (f == 0) {
			System.out.print("Transaction Successful");
		}

	}
}
