/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_Q1n2;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class TestIntMyStack {
    public static void main(String[] args) {
        
        MyStack<Integer>IntMyStack = new MyStack();
        Scanner s = new Scanner(System.in);
        int enterInt,inIndex=1;
        System.out.println("Enter a positive integer value to push into stack or enter -1 to stop");
        do{
            System.out.print("("+inIndex+"): ");
            enterInt = s.nextInt();
            if(enterInt>=0){
                IntMyStack.push(enterInt);
                inIndex++;
            }
            }while(enterInt!=-1);
        System.out.println("The size of stack: "+IntMyStack.getSize());
        
        System.out.print("Pop:");
        do{
            System.out.print(" "+IntMyStack.pop()); 
        }while(IntMyStack.getSize()!=0);
        System.out.println();
        
        //Pop order the is last element is out first until the stack i empty
        //because stack follows the order of first in last out concept(FILO)
    }
}
