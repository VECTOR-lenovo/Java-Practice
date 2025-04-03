package Toutorial06week;
import java.util.Queue;
public class Task07 {
    public static void main(String[] args) {
        Queue<String> queue1 = new java.util.LinkedList<String>();{
            queue1.add("A");
            queue1.add("B");
            queue1.add("C");
            queue1.remove("A");
            queue1.add("D");
            queue1.add("E");
            System.out.println(queue1.peek());
            System.out.println(queue1);

            }

        }
    }

