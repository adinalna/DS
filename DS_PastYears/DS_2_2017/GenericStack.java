/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2017;

/**
 *
 * @author adina
 * @param <E>
 */
public class GenericStack<E> implements StackInterface<E> {

    //default constuctor
    public GenericStack() {
        System.out.println("Create a new stack: an empty pile of books");
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public E peek() {
        return (E)stack.get(stack.size()-1);
    }

    @Override
    public E pop() {
        E removed=(E)stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return removed;
    }

    @Override
    public void push(E e) {
        stack.add(e);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
    
    
}
