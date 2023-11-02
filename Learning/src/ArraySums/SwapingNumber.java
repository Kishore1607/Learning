package ArraySums;

public class SwapingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 16;
		float b = 26;
		
		// BitWise method

		// Addition and subtraction method
		a = a + b;
		b = a - b;
		a = a - b;
		
		// Devide and Multiply method
		b = b / a;
		a = b * a;
		b = a / b;

		System.out.println((int)a + " " +(int) b);
	}

}
