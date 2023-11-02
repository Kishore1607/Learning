package StringSums;
public class ReverseName {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = null;

		if (value == null || value == "") {
			System.out.print("Invalid input");
		} else {
			String alpha = "abcdefghijklmnopqrstuvwxyz";
			String result = "";

			for (int i = 0; i < alpha.length(); i++) {
				for (int j = 0; j < value.length(); j++) {
					if (alpha.charAt(i) == value.charAt(j)) {
						result += value.charAt(j);
					}
				}
			}
			System.out.println("Reversed name with ascending order: " + result);
			System.out.print("Reversed name :");

			for (int j = value.length() - 1; j >= 0; j--) {
				System.out.print(value.charAt(j));
			}
		}
	}
}
