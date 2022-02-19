/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostfixCalculator;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class InfixToPostfix {
    public static Stack<Character>stack=new Stack<>();
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an infix expression: ");
        String input = s.nextLine();
        System.out.println("Postfix: "+Conversion(input));
    }
    
    public static int precedence(char operator){
        if(operator=='+'||operator=='-')
            return 1;
        else if(operator=='/'||operator=='*')
            return 2;
        return -1;     
    }
    
    public static String Conversion(String infix){
        
        String output="";
        for(int i=0;i<infix.length();i++){
            char a=infix.charAt(i);
            if(Character.isLetterOrDigit(a)){
                output+=a;
            }else if(a=='('){
                stack.push(a);
            }else if(a==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    output+=stack.pop();
                }        
                stack.pop();
            }else{
                while(!stack.isEmpty()&&precedence(a)<=precedence(stack.peek())){
                    output+=stack.pop();
                }
                stack.push(a);
            }
        }
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            output += stack.pop();
        }
        return output; 
    }
}
