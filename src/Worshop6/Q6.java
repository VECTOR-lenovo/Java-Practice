package Worshop6;
import java.util.Arrays;
import java.util.Stack;
import java.util.Collections;
public class Q6 {
    public static void main(String[] args) {
        String Sentence = "Hello World";
        String[] wordsArray = Sentence.split(" ");
        Stack<String> Words = new Stack<String>();
        for (String word : wordsArray) {
            Words.push(word);
        }
        System.out.println("Reversed words: " + String.join(" ", Words.reversed()));
    }
    }


