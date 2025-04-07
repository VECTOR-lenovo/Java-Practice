package Worshop6;
import java.util.LinkedList;
public class Q2 {
    public static void main(String[] args) {
        LinkedList <String> elementList = new LinkedList<String>();
        elementList.addFirst("Hydrogen");
        elementList.addLast("Oxygen");
    if (elementList.isEmpty()) {
        System.out.println("The list is empty.");
    } else {
        System.out.println("The list is not empty.");
    }
    System.out.println("The Listed elements are : " + elementList);
    }
}
