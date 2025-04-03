package Toutorial06week;
import java.util.ArrayList;
public class Task01_02 {
    public static void main(String[] args) {
        ArrayList<String>studentlist = new ArrayList<String>();
        studentlist.add("John");
        studentlist.add("Jane");
        studentlist.add("Jack");
        studentlist.remove("Jane");
        System.out.println("Student list: " + studentlist);
        System.out.println(studentlist.reversed());

    }
}
