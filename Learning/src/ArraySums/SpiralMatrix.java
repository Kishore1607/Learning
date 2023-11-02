package ArraySums;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m = 4;
		int[][] ma = new int[n][m];

		int number = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				number++;
				ma[i][j] = number;
			}
		}

		System.out.println("Matrix :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(ma[i][j] + " ");
			}
			System.out.println();
		}

		int left = 0, right = m, top = 0, bottom = n;
		System.out.println("Result :");

		while (left < right && top < bottom) {
			for (int i = left; i < right; i++) {
				System.out.print(ma[top][i] + " ");
			}
			top++;
			for (int i = top; i < bottom; i++) {
				System.out.print(ma[i][right - 1] + " ");
			}
			if (left <= right) {
				right--;
				for (int i = right - 1; i >= left; i--) {
					System.out.print(ma[bottom - 1][i] + " ");
				}
				bottom--;
				if (top <= bottom) {
					for (int i = bottom - 1; i >= top; i--) {
						System.out.print(ma[i][left] + " ");
					}
					left++;
				}
			}
		}

	}

}
