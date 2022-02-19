/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2018;


import java.util.ArrayList;

/**
 *
 * @author adina
 */
public class StackWithGeneric<E> {
    private int capacity;
    ArrayList<E>MyStack=new ArrayList<>();

    //default constructor
    public StackWithGeneric() {
    }
    
    //constructor with parameter
    public StackWithGeneric(int capacity) {
        this.capacity = capacity;
    }
    
    //return whether or not the stack is empty 
    public boolean isEmpty(){
        return MyStack.isEmpty();
    }
    
    //Return the value of the first element in the stack without removing it
    public E peek(){
        return MyStack.get(MyStack.size()-1);
    }
    
    //Add element on top of the stack
    public void push(E e){
        System.out.println("Push item into the stack: "+e);
        MyStack.add(e);
    }
    
    //Remove the element from the top of the stack
    public E pop(){
        E temp=MyStack.get(MyStack.size()-1);
        MyStack.remove(MyStack.size()-1);
        System.out.println("Removing "+temp+" ..");
        return temp;
    }
    
    //Remove all elements from the stack
    public void popAll(){
        System.out.println("Pop all items in stack:");
        while(!isEmpty()){
            pop();
        }
    }
    
    //Display all the elements in the stack 
    public void display(){
        System.out.println("Display stack:");
        if(!isEmpty()){
            for(E e:MyStack)
                System.out.println(e);
        }
        if(capacity!=MyStack.size()){
            int remaining=capacity-MyStack.size();
            for(int i=0;i<remaining;i++)
                System.out.println("null");
        }
    }
   
    //Display all elements in the stack in reversed order
    public void displayInReverse(){
        System.out.println("Display stack in reverse:");
        if(!isEmpty()){
            for(int i=MyStack.size()-1;i>=0;i--)
                System.out.println(MyStack.get(i));
        }if(capacity!=MyStack.size()){
            int remaining=capacity-MyStack.size();
            for(int i=0;i<remaining;i++)
                System.out.println("null");
        }
    }
    
    
}
