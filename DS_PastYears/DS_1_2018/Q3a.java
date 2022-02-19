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
public class Q3a {
    public static void main(String[] args) {
        
        StackTest stack1 = new StackTest(4);
        stack1.push("one");
        stack1.push("two");
        stack1.push("three");
        stack1.push("four");
        stack1.displayInReverse();
        stack1.popAll();
        stack1.displayInReverse();
    }
}
