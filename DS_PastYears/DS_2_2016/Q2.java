/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2016;

import java.util.Stack;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;



/**
 *
 * @author adina
 */
public class Q2 {
    public static void main(String[] args) {
        
        try {
            Scanner in = new Scanner(new FileInputStream("bracketText.txt"));
            int num=1;
            while (in.hasNextLine()){
                String input = in.next();
                System.out.print(num+"."+input+" -> ");
                bracketChecker(input);
                num++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }

    }
    
    public static void bracketChecker(String string){
        boolean hasBrackets=false;
        boolean valid=true;
        Stack<Character>stack = new Stack<>();
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(!Character.isDigit(ch)&&!Character.isLetter(ch)){
                if(ch=='['||ch=='{'||ch=='('||ch=='<'){
                    stack.push(string.charAt(i));
                    hasBrackets=true;
                }else{
                    if(ch==']'||ch=='}'||ch==')'||ch=='>')
                         hasBrackets=true;  
                    if(!stack.isEmpty()){
                        if(ch==']'&&stack.pop()!='['){
                            valid=false;
                            break;
                        }
                        else if(ch=='}'&&stack.pop()!='{'){
                            valid=false;
                            break;
                        }
                        else if(ch==')'&&stack.pop()!='('){
                            valid=false;
                            break;
                        }
                        else if(ch=='>'&&stack.pop()!='<'){
                            valid=false;
                            break;
                        }      
                    }else{
                        valid=false;
                        break;
                    }
                }
            }
        }
        if(hasBrackets){
            if(valid){
                System.out.println("YES - all matched!");
            }else{
                System.out.println("Not all brackets are matched");
            }
        }else{
            System.out.println("There is no bracket in the input");
        }
    } 
}
