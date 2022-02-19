/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3a;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Test3aQ1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //To display for user input
        System.out.print("Enter Top Up Code: ");
        String code=s.next();
        topUpCode(code);
    }
    
    public static void topUpCode(String s){
        if(s.length()<3){
            System.out.println("Correct");//display that the code is correct
        }else{
            int begin=0,end=s.length()-1;
            boolean stop=false;
            while(true){
                if(stop==true){//to display that the code is wrong
                    System.out.println("Please put the digits between two stars");
                    break;
                }
                if(s.charAt(begin)=='*'&&s.charAt(end)=='*'){
                    topUpCode(s.substring(begin+1,end));
                    break;
                }else if(s.charAt(begin)=='*'&&s.charAt(end)!='*'){
                    end--; 
                }else if (s.charAt(begin)!='*'&&s.charAt(end)!='*'){
                    begin++;
                    
                }else{
                    begin++;
                    end--; 
                }
            }
        }
    }
    
}
