package StringSums;

public class EncryptUsingIndex {
	public static void main(String[] args) {
		String s = "yum baby zoro";
		String ans = "";
		int l = s.length();
		int z = 0;
		for (int i = 0; i < l; i++) {
			if (s.charAt(l - i - 1) == ' ') {
				z = 0;
				ans = " " + ans;
				continue;
			}
			int num = (int) s.charAt(l - 1 - i);
			System.out.print("Char = " + (char) num);
			System.out.print(" Ascii = " + num);
			System.out.print(" index = " + z);
			System.out.println(" Added index " + ((int) num + z));
			int n = num + z;
			if (n >= 122) {
				n = n - 122 + 96;
				ans = (char) n + ans;
			} else {
				ans = (char) n + ans;
			}
			z++;
		}
		System.out.print(ans);
	}
}
