/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze;


import java.util.ArrayList;

/**
 *
 * @author adina
 */
public class Stack<E> {
    
    private ArrayList<E>MyStack;

    public Stack() {
        MyStack=new ArrayList<>();
    }
    
    //1) public void push(E 0);
    public void push(E e){
        MyStack.add(e);
    }
    
    //2) public E pop();
    public E pop(){
        E temp=MyStack.get(MyStack.size()-1);
        MyStack.remove(MyStack.size()-1);
        return temp;
    }
    
    //3) public E peek();
    public E peek(){
        return MyStack.get(MyStack.size()-1);
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
        return MyStack.toString();
    }
    
    //7) public boolean search(E o);
    public boolean search(E o){
        for(E stack:MyStack){
            if(stack.equals(o))
                return true;
        }
        return false;
    }
    
    public ArrayList<E> toArrayList(){
        ArrayList<E> list = new ArrayList<E>();
        for(E stack:MyStack){
            list.add(stack);
        }
        return list;
    }

    
}
