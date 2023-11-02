package StringSums;

public class Palandrom {

	public static void main(String[] args) {
		String name = null;
		System.out.print(Palandrom.palan(name));
	}

	public static String palan(String name) {
		if(name == null || name == "") {
			return "Not a palandrom";
		}
		String value = name;
		String ans = value.toLowerCase();
		int length = value.length() - 1;
		for (int i = 0; i < length / 2; i++) {
			if (ans.charAt(i) != ans.charAt(length - i)) {
				return "Not a palandrom";
			}
		}
		return "palandron";
	}

}
