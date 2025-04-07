package Worshop6;
import java.util.Stack;
public class Q5 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Read");
        stack.push("Write");
        stack.push("Code");

        String peekedElement = stack.peek();
        System.out.println("Peeked element: " + peekedElement);

        stack.push("Debug");
        stack.push("Test");

        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);


        System.out.println("Stack after pop: " + stack);

    }
}
