package Toutorial06week;
import java.util.Stack;
public class Task06 {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<String>();
        stack1.push("A");
        stack1.push("B");
        stack1.push("C");
        stack1.pop();
        stack1.push("D");
        stack1.push("E");
        System.out.println(stack1.peek());
        System.out.println(stack1);

    }
}
