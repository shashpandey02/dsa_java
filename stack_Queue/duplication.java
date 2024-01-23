import java.util.Stack;

public class duplication {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String exp = "((a+b)+((c+b)))";
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == ')') {
                if (s.peek() == '(') {
                    // pair does not contains and element
                    // duplication is there
                    System.out.println("true");
                    return;
                } else {
                    while (s.peek() != '(') {
                        // poping each character unting opening bracket appears
                        s.pop();
                    }
                    // pop opening braket also
                    s.pop();
                }
            } else {
                // push every character in stack
                s.push(ch);
            }
        }
        System.out.println("false");
        return;

    }

}
