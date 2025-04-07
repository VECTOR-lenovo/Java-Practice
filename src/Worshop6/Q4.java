package Worshop6;
import java.util.LinkedList;
import java.util.Collections;


public class Q4 {
    public static void main(String[] args){
        LinkedList<String> Colors = new LinkedList<String>();
        Colors.add("red");
        Colors.add("green");
        Colors.add("blue");
        Colors.add("yellow");
        Colors.add("purple");
        System.out.println(Colors);


        if (Colors.contains("red")){
            System.out.println("The list contains red");
        } else {
            System.out.println("The list does not contain red");
        }


        Collections.shuffle(Colors);
        System.out.println("The shuffled list is: " + Colors);


        Collections.sort(Colors);
        System.out.println("The sorted list is: " + Colors);
    }
}
