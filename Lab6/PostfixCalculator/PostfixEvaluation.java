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
public class PostfixEvaluation {
    public static Stack<Integer>stack=new Stack<>();
    public static void main(String[] args) {
        
        Scanner s =new Scanner(System.in);
        System.out.print("Enter an infix expression: ");
        String input = s.nextLine();
        System.out.println("Result: "+evaluate(input));
    }
    public static int evaluate(String input){
        for(int i=0;i<input.length();i++){
           char ch = input.charAt(i);
           int result,a,b;
            System.out.println(ch); 
           if(Character.isDigit(ch)){
               stack.push(Character.getNumericValue(ch));
           }else{
               switch (ch){
                   case '+':   
                            result=stack.pop()+stack.pop();
                            stack.push(result);
                       break;
                   case '-':
                            b = stack.pop();
                            a = stack.pop();
                            result=a-b;
                            stack.push(result);
                        break; 
                   case '*':
                            result=stack.pop()*stack.pop();
                            stack.push(result);
                       break;
                   case '/':
                            b = stack.pop();
                            a = stack.pop();
                            result=a/b;
                            stack.push(result);
                        break;
                   default:
                       break;
               }
           }  
        }
    return stack.peek();
    }
}
