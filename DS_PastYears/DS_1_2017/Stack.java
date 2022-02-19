/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2017;

/**
 *
 * @author adina
 */
public class Stack<E> {
    private int capacity=10;
    private int size;
    StackNode<E>head,tail;
    
    //default constructor 
    public Stack() {
        size=0;
        head=null;
        tail=null;
    }
  
    //constructor with capacity parameter for intialization
    public Stack(int capacity) {
        this.capacity = capacity;
        size=0;
        head=null;
        tail=null;
    }
    
    //Inserts a new item to the top of the stack
    public void push(E e){
        StackNode newNode = new StackNode(e);
        if(isEmpty()){
            head=tail=newNode;
            size++;
        }else if(isFull())
            System.out.println("Stack is full");
        else{
            tail.next=newNode;
            tail=newNode;
            size++;
        }
    }
    
    //Removes an item form on top of the stack
    public E pop(){
        E removed = tail.element;
        if(size==1){     
            head=tail=null;
        }else{
            StackNode<E> current=head;
            StackNode<E> prev=head;
            while(current.next!=null){
                prev=current;
                current=current.next;
            }
            prev.next=null;
            tail=prev;
        }
        size--;
        return removed;
    }
    
    //Return the top of the satck without removing it
    public E peek(){
        StackNode<E> current=head;
        while(current.next!=null){
            current=current.next;
        }
        return current.element;
    }
    
    //Returns true if the stack is empty
    public boolean isEmpty(){
        return head==null;
    }
    
    //Return true of satck is full
    public boolean isFull(){
        return size==capacity;
    }
}
