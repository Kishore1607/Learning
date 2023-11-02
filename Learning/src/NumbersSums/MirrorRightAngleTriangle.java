package NumbersSums;

//import java.util.Scanner;

public class MirrorRightAngleTriangle {
	public static void main(String args[]) {

//	      Scanner value = new Scanner(System.in);
//	      int a = value.nextInt();
		int n = 4;
		int num = (n * 2) - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			num -= 2;
		}
	}
}
