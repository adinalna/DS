/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_Q1n2;

import java.util.ArrayList;

/**
 *
 * @author adina
 */
public class MyStack<E> {
    
    ArrayList<E>MyStack=new ArrayList<>();
    
    //1) public void push(E 0);
    public void push(E e){
        MyStack.add(e);
    }
    
    //2) public E pop();
    public E pop(){
        E temp=MyStack.get(getSize()-1);
        MyStack.remove(getSize()-1);
        return temp;
    }
    
    //3) public E peek();
    public E peek(){
        return MyStack.get(getSize()-1);
    }
    
    //4) public int getSize();
    public int getSize(){
        return MyStack.size();
    }
    
    //5) public boolean isEmpty();
    public boolean isEmpty(){
        return MyStack.isEmpty();
    }
    
    //6) public String toString();
    @Override
    public String toString() {
        return "MyStack: "+MyStack.toString();
    }
    
    //7) public boolean search(E o);
    public boolean search(E o){
        for(E stack:MyStack){
            if(stack.equals(o))
                return true;
        }
        return false;
    }

    
}
