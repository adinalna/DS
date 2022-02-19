/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2020;
/**
 *
 * @author adina
 */
public class Q1 {
    public static void main(String[] args) {
        
        GenericStack<String>stack1=new GenericStack<>(7);
        stack1.push("apple");
        stack1.display();
        stack1.pushMany("broccoli,chicken sandwich,donut,french fries,juice,maruku");
        stack1.display();
        System.out.println("Pop the top of the stack: "+stack1.pop());
        System.out.println("Pop the top of the stack: "+stack1.pop());
        stack1.display();
        System.out.println("Pop middle of the stack: "+stack1.popMiddle());
        
        stack1.display();
        System.out.println("Pop middle of the stack: "+stack1.popMiddle());
        stack1.display();//check again
        System.out.println("-----------------------------------------");
        GenericStack<Integer>stack2=new GenericStack<>(10);
        stack2.push(1);
        stack2.push(2);
        stack2.pushMany("3 4,5,6 7");
        stack2.display();
        stack2.popAll();
        stack2.display();
    }
}
