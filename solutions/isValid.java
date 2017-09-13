/**
 * Created by becky on 9/5/17.
 */
import java.util.Stack;

public class isValid {
    public static int isValid(String s) {
        if(s == null || s.length() == 0 || s.length() % 2 == 1) {
            return -1;
        }
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(')');
            } else if(c == '[') {
                stack.push(']');
            } else if(c == '{') {
                stack.push('}');
            } else if(stack.isEmpty() || stack.pop() != c) {
                return -1;
            }
        }
        return s.length() / 2;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("(())[]"));
    }
}
