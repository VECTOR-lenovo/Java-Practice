package Worshop6;
import java.util.ArrayList;
public class Q1 {
    public static void main(String[] args) {
        ArrayList<String> studentlist = new ArrayList<String>();
        studentlist.add("John");
        studentlist.add("Jane");
        studentlist.add("Jack");
        studentlist.add("Bob");
        studentlist.add("Alice");
        studentlist.remove("Jane");
        System.out.println("Student list: " + studentlist);
    }
}
