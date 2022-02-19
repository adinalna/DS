/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2018;

/**
 *
 * @author adina
 */
public class Q3b {
    public static void main(String[] args) {
        
        StackWithGeneric<String> stack1 = new StackWithGeneric<>(4);
        stack1.push("one");
        stack1.push("two");
        stack1.push("three");
        stack1.push("four");
        System.out.println(stack1.peek());
        stack1.display();
        stack1.displayInReverse();
        stack1.popAll();
        
        StackWithGeneric<Integer> stack2 = new StackWithGeneric<>(4);
        stack2.push(100);
        stack2.push(200);
        stack2.push(300);
        stack2.push(400);
        System.out.println(stack2.peek());
        stack2.display();
        stack2.displayInReverse();
        stack2.popAll();
    }
}
