package StackSums;

import java.util.Stack;

public class GenerateParanthesis {
	public static boolean hasMatchingBrackets(String[] brackets) {
		Stack<String> stack = new Stack<>();
		for (String bracket : brackets) {
			if (bracket.equals("{")) {
				stack.push("{");
			} else if (bracket.equals("}")) {
				if (stack.isEmpty() || !stack.pop().equals("{")) {
					return false;
				}
			} else {
				// Ignore any characters that are not brackets
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String[] bracketArray = { "{", "}", "{", "{", "}", "}", "}" };
		boolean isMatching = hasMatchingBrackets(bracketArray);
		if (isMatching) {
			System.out.println("The brackets are matching.");
		} else {
			System.out.println("The brackets are not matching.");
		}
	}
}
