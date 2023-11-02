package sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 77, 9, 62 };

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int f = 0;
			for (int j = 0; j < n - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					// Temp variable
					int a = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = a;

//					// Exor method
//					arr[j] = arr[j] ^ arr[j+1];
//					arr[j+1] = arr[j] ^ arr[j+1];
//					arr[j] = arr[j] ^ arr[j+1];
//					
//					// Addition and Subration
//					arr[j] = arr[j] + arr[j+1];
//					arr[j+1] = arr[j] - arr[j+1];
//					arr[j] = arr[j] - arr[j+1];
//					
//					// Multiplication and Divisin
//					arr[j] = arr[j] * arr[j+1];
//					arr[j+1] = arr[j] / arr[j+1];
//					arr[j] = arr[j] / arr[j+1];

				} else {
					f++;
					System.out.println("f in "+i+" = "+f);
				}
			}
			if (f == n - 1 - i) {
				break;
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
