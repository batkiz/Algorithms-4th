import edu.princeton.cs.algs4.StdIn;

/**
 * Parentheses
 */
public class Parentheses {

    public static void main(String[] args) {
        String string = StdIn.readString();
        Stack<String> stack = new Stack<>();
        String[] inputs = string.split("");
        for (String input : inputs) {
            if (input.equals("{") || input.equals("[") || input.equals("(")) {
                stack.push(input);
            } else if (!stack.isEmpty()) {
                if (input.equals("}")) {
                    if (!stack.pop().equals("{")) {
                        System.out.println(false);
                        return;
                    }
                } else if (input.equals("]")) {
                    if (!stack.pop().equals("[")) {
                        System.out.println(false);
                        return;
                    }
                } else if (input.equals(")")) {
                    if (!stack.pop().equals("(")) {
                        System.out.println(false);
                        return;
                    }
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}