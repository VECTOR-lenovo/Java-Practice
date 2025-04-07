package Worshop6;
import java.util.LinkedList;
import java.util.Queue;
public class Q7 {
    public static void main(String[] args) {

    Queue<String> printQueue = new LinkedList<>();
        printQueue.add("Document1");
        printQueue.add("Document2");
        printQueue.add("Document3");

    String dequeuedJob = printQueue.poll();
        System.out.println("Dequeued job: " + dequeuedJob);

        printQueue.add("Document4");
        printQueue.add("Document5");

    String nextJob = printQueue.peek();
        System.out.println("Next job: " + nextJob);

        System.out.println("Print queue: " + printQueue);
    }
}

