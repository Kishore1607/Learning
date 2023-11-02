package methods;

public class StringMethods {
	public static void main(String[] args) {
		String str1 = "Hello";
		char ch = str1.charAt(1); // ch now contains 'e'
		System.out.println("charAt(1): " + ch);

		String str2 = "Hello";
		int length = str2.length(); // length now contains 5
		System.out.println("length(): " + length);

		String str3 = "Hello, World";
		String sub = str3.substring(0, 5); // sub now contains "Hello"
		System.out.println("substring(0, 5): " + sub);

		String str4 = "Hello, World";
		int index = str4.indexOf("World"); // index now contains 7
		System.out.println("indexOf(\"World\"): " + index);

		String str5 = "Hello";
		String str6 = "hello";
		boolean isEqual = str5.equals(str6); // isEqual is false
		System.out.println("equals(\"hello\"): " + isEqual);

		String str7 = "Hello, World";
		String upper = str7.toUpperCase(); // upper now contains "HELLO, WORLD"
		String lower = str7.toLowerCase(); // lower now contains "hello, world"
		System.out.println("toUpperCase(): " + upper);
		System.out.println("toLowerCase(): " + lower);

		String str8 = "   Hello, World   ";
		String trimmed = str8.trim(); // trimmed now contains "Hello, World"
		System.out.println("trim(): " + trimmed);

		String str9 = "Hello, World";
		boolean startsWithHello = str9.startsWith("Hello"); // true
		boolean endsWithWorld = str9.endsWith("World"); // true
		System.out.println("startsWith(\"Hello\"): " + startsWithHello);
		System.out.println("endsWith(\"World\"): " + endsWithWorld);

		String str10 = "Hello, John. Hello, Jane.";
		String replaced = str10.replace("Hello", "Hi"); // replaced now contains "Hi, John. Hi, Jane."
		System.out.println("replace(\"Hello\", \"Hi\"): " + replaced);

		String str11 = "apple,banana,cherry";
		String[] fruits = str11.split(","); // fruits now contains ["apple", "banana", "cherry"]
		for (String fruit : fruits) {
			System.out.print(fruit + " ");
		}
		System.out.println();

	}
}
