/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2017;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=s.next();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<input.length();i++){
            stack.push(input.charAt(i));
        }
        String reversed="";
        while(!stack.isEmpty()){
            reversed+=stack.pop();
        }
        System.out.println("Reversed: "+reversed);
    }
}
