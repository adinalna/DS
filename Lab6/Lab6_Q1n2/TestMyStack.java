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
public class TestMyStack {
    public static void main(String[] args) {
        
        //Q1(b)
        MyStack<Character>ChStack=new MyStack<>();
        ChStack.push('a');
        ChStack.push('b');
        ChStack.push('c');
        System.out.println(ChStack.toString());
        System.out.println("Element 'b' is in the stack: "+ChStack.search('b'));
        System.out.println("Element 'k' is in the stack: "+ChStack.search('k'));
        
        //Q1(c)
        MyStack<Integer>IntStack=new MyStack<>();
        IntStack.push(1);
        IntStack.push(2);
        IntStack.push(3);
        System.out.println("\n"+IntStack.toString());
        System.out.println("Element '6' is in the stack: "+IntStack.search(6));
    
        }
}
