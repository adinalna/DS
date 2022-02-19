/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7_Q2;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String word;
        System.out.print("Enter a String: ");
        word = s.next();
        Queue<Character>queue = new Queue<>();
        for(int i=0;i<word.length();i++){
            queue.enqueue(word.charAt(i));
        }
        System.out.println(queue.toString());
        String reverse = "";
        while(!queue.isEmpty()){
            reverse=queue.dequeue()+reverse;
        }
        System.out.println("Reverse string: "+reverse);
        
        if(word.equals(reverse))
            System.out.println("-> The String is a palindrome");
        else
            System.out.println("-> The String is not a palindrome");
    }
}
