package Homework4.Task2;

import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("[]{}"));
    }

    /**
     *
     * @param s take a method string
     * @return push back method
     */
    public static boolean isValid(String s) {
        if (Objects.isNull(s) || s.isEmpty() || s.length() < 2) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Objects.equals(c, '(') || Objects.equals(c, '[') || Objects.equals(c, '{')) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if (Objects.equals(c, ')') && !Objects.equals(last, '(')) {
                    return false;
                }
                if (Objects.equals(c, ']') && !Objects.equals(last, '[')) {
                    return false;
                }
                if (Objects.equals(c, '}') && !Objects.equals(last, '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}