package StackSums;
import java.util.Stack;

public class PairOfBrackets {

	public static String findBalancedSubstring(String input) {
        Stack<Integer> stack = new Stack<>();
        int startIndex = -1;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(i);
            } else if (input.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    if (stack.isEmpty()) {
                        startIndex = i;
                    } else {
                        startIndex = Math.max(startIndex, stack.peek());
                    }
                }
            }
        }
        
        if (startIndex >= 0) {
            return input.substring(startIndex, input.length() - startIndex);
        } else {
            return ""; // No balanced substring found
        }
    }
    
    public static void main(String[] args) {
        String input = "()((())a)()((";
        String balancedSubstring = findBalancedSubstring(input);
        System.out.println(balancedSubstring);
    }

}
