/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9_Q1;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Lab9_Q1 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String string=s.next();
    System.out.println("Result: "+subsituteAI(string)); 
    }
    public static String subsituteAI(String s){
        String output;
        if(s.length()==1){
            if(s.equals("a"))
                s="i";
            return s;
        }else{
            if(s.charAt(0)=='a')
                output="i"+subsituteAI(s.substring(1));
            else
                output=s.charAt(0)+subsituteAI(s.substring(1));
            return output;
        }
    }
}
