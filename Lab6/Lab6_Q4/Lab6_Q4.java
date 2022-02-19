/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_Q4;



/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Lab6_Q4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Stack<Character>stack = new Stack();
        System.out.print("Enter a word to be determined as a palindrome: ");
        String word=s.next();
        for(int i=0;i<word.length();i++){
            stack.push(word.charAt(i));
        }
        String reverse = "";
        while(!stack.isEmpty()){
            reverse+=stack.pop();
        }
        System.out.println("The word is reverse: "+reverse);
        
        if(word.equals(reverse))
            System.out.println("The word is a palindrome");
        else
            System.out.println("The word is not a palindrome");
        
    }
}
