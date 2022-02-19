/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2019;

/**
 *
 * @author adina
 */
public class Q1 {
    public static void main(String[] args) {
        
        GenericStack<String>stack1=new GenericStack<>(5);
        stack1.push("one");
        stack1.display();
        stack1.pushMany("two,three four,five,six seven");
        stack1.display();
        stack1.pop();
        stack1.pop();
        stack1.display();
        System.out.println("----------------------");
        GenericStack<Integer>stack2=new GenericStack<>(5);
        stack2.push(1);
        stack2.push(2);
        stack2.pushMany("3 4,5,6 7");
        stack2.display();
        stack2.popAll();
        stack2.display();
    }
}
