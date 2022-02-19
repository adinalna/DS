/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2017;

import java.util.ArrayList;

/**
 *
 * @author adina
 * @param <E>
 */
public interface StackInterface<E> {
    ArrayList stack = new ArrayList();
    
    //Interface cannot have a constructor
    
    //returns the number of elements in this stack
    public int size();
    
    //Returns the top elemnet in the stack
    public E peek();
    
    //Returns and removes the top element in this stack
    public E pop();
    
    //Add anew lement to the top of the stack
    public void push(E e);
    
    //Returns true if the stack is empty
    public boolean isEmpty();
}
