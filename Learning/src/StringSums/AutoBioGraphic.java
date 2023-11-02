package StringSums;

public class AutoBioGraphic {

	public static void main(String[] args) {
		String n = "12101";
		System.out.println(findAutoCount(n));

	}

	public static int findAutoCount(String n) {
		int[] valueCount = new int[10];
		int count = 0;

		for (int i = 0; i < n.length(); i++) {
			valueCount[n.charAt(i) - '0']++;
		}
		for (int i = 0; i < n.length(); i++) {
			if (valueCount[i] > 0) {
				count++;
			}
		}
		for (int i = 0; i < n.length(); i++) {
			valueCount[i] = valueCount[i] - (n.charAt(i) - '0');
		}
		for (int i = 0; i < n.length(); i++) {
			if (valueCount[i] != 0) {
				return 0;
			}
		}
		return count;
	}

}
