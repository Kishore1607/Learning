package StringSums;
import java.util.*;

public class StringAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "5/6*8+10-99/1+21";

		if (isValidString(line)) {
			System.out.println(answer(line));
		} else {
			System.out.println("String contains invalid characters.");
		}

	
	}

	public static int answer(String line) {
		String[] parts = line.split("(?<=[-+*/])|(?=[-+*/])");

		List<String> arr = new ArrayList<>(Arrays.asList(parts));
		System.out.println(arr.toString());
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).equals("/") && arr.get(i + 1).equals("0")) {
				return 0;
			} else if (arr.get(i).equals("/")) {
				String s = action(arr.get(i - 1), arr.get(i + 1), arr.get(i));
				arr.set(i, s);
				arr.remove(i - 1);
				arr.remove(i);
			}
		}
		System.out.println(arr.toString());
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).equals("*")) {
				String s = StringAction.action(arr.get(i - 1), arr.get(i + 1), arr.get(i));
				arr.set(i, s);
				arr.remove(i - 1);
				arr.remove(i);
			}
		}
		System.out.println(arr.toString());
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).equals("+")) {
				String s = StringAction.action(arr.get(i - 1), arr.get(i + 1), arr.get(i));
				arr.set(i, s);
				arr.remove(i - 1);
				arr.remove(i);
			}
		}
		System.out.println(arr.toString());
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).equals("-")) {
				String s = StringAction.action(arr.get(i - 1), arr.get(i + 1), arr.get(i));
				arr.set(i, s);
				arr.remove(i - 1);
				arr.remove(i);
			}
		}
		int value = Integer.parseInt(arr.get(0));
		
		return value;
		
	}
	public static String action(String a, String b, String symbol) {
		System.out.print(a + symbol + b + " : ");
		int n1 = Integer.parseInt(a);
		int n2 = Integer.parseInt(b);
		if (symbol.equals("/")) {
			int ans = n1 / n2;
			System.out.println(ans);
			return ans + "";
		} else if (symbol.equals("*")) {
			int ans = n1 * n2;
			System.out.println(ans);
			return ans + "";
		} else if (symbol.equals("+")) {
			int ans = n1 + n2;
			System.out.println(ans);
			return ans + "";
		} else {
			int ans = n1 - n2;
			System.out.println(ans);
			return ans + "";
		}
	}

	public static boolean isValidString(String input) {
		String validRegex = "[0-9+\\-*/]+";

		if (input.matches(validRegex)) {
			return true;
		} else {
			return false;
		}
	}
}
