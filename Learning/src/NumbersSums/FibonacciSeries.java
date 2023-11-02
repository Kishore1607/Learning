package NumbersSums;

public class FibonacciSeries {

	public static void main(String[] args) {

		int fvalue = 0;
		int svalue = 1;

		int n = 2;

		if (n <= 0) {
			System.out.print("Invalid Input");
		} else if (n == 1) {
			System.out.print(fvalue);
		}  else if (n == 2) {
			System.out.print(fvalue + " " + svalue );
		} else {

			System.out.print(fvalue + " " + svalue + " ");
			for (int i = 2; i < n; i++) {

				int newValue = fvalue + svalue;
				System.out.print(newValue + " ");
				fvalue = svalue;
				svalue = newValue;
			}

		}
	}

}
