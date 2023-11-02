package StringSums;

public class ExceptionPriority {

	@SuppressWarnings("finally")
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		try {
			throw new NullPointerException ("super");
		}catch(IllegalArgumentException e) {
			System.out.print("hyder");
		}finally {
			throw new ArithmeticException ("back");
		}
	}

}
