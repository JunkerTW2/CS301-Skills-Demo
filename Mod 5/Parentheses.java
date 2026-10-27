
/**
 * Write a stack client that reads a string of parentheses, square brackets, and
 * curly braces from standard input and uses a stack to determine whether they
 * are properly balanced. For example, your program should print true for
 * [()]{}{[()()]()} and false for [(]).
 */
import java.util.*;

public class Parentheses {

    void main() {
        String str = StdIn.readString();
        boolean isBalanced = parentheses(str);
        IO.println("Is the supplied string of brackets balanced? => " + isBalanced);
    }

    public static boolean parentheses(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char character = stack.pop();
                if (str.charAt(i) == ')' && character != '(') {
                    return false;
                }
                if (str.charAt(i) == ']' && character != '[') {
                    return false;
                }
                if (str.charAt(i) == '}' && character != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
