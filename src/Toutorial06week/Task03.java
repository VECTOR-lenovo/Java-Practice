package Toutorial06week;
import java.util.ArrayList;
public class Task03 {
    public static void main(String[] args) {
        ArrayList<String> arraylist1= new ArrayList<String>();
        ArrayList<String> arraylist2= new ArrayList<String>();
        arraylist1.add("Jane");
        arraylist1.add("John");
        arraylist2.add("Jack");
        arraylist2.add("Jill");
        arraylist1.addAll(arraylist2);
        System.out.println("ArrayList1: " + arraylist1);
    }
}
