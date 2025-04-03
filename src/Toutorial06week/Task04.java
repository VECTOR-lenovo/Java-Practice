package Toutorial06week;
import java.util.LinkedList;
public class Task04 {
    public static void main(String[] args) {
        LinkedList<String> arraylist= new LinkedList<String>();
        arraylist.add("Jane");
        arraylist.addFirst("John");
        arraylist.addLast("Jack");
        if (arraylist.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }
        System.out.println(arraylist);

    }
}

