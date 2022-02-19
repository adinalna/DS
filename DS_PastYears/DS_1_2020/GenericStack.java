/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2020;



/**
 *
 * @author adina
 */
public class GenericStack<E> {
    private final int capacity;
    private int size;
    StackNode<E>head,tail;
    
    //Constructor for the generic stack class
    public GenericStack(int capacity) {
        this.capacity = capacity;
        size=0;
        head=null;
        tail=null;
    }
    
    //isEmpty 
    public boolean isEmpty(){
        return head==null;
    }
    
    //isFull
    public boolean isFull(){
        return capacity==size;
    }
    
    //peek
    public E peek(){
        if(isEmpty()){
            return null;
        }else{
            return tail.element;
        }
    }
    
    //push
    public void push(E e){
        StackNode<E>newNode=new StackNode<>(e);
        if(isEmpty()){
            System.out.println("Push: " + e);
            head =tail= newNode;
            size ++;
        }else if(isFull()){
            System.out.println("Stack is full");
        }else{
            System.out.println("Push: " + e);
            tail.next=newNode;
            tail=newNode;
            size ++;
        }
    }
    
    //pushMany
    public void pushMany(String allE){
        if(!isFull()){
            System.out.println("Push many into stack. Displaying...");
            E[]many=(E[]) allE.split(",");
            for(E e:many){
                if(!isFull()){
                    push(e);
                }else{
                    System.out.println("Stack is full");
                    break;
                }
            }
        }else{
             System.out.println("Stack is full");
        }
    }
    
    //pop
    public E pop(){
        if(isEmpty())
            return null;
        else if(size==1){
            E removed = tail.element;
            head=tail=null;
            size--;
            return removed;
        }
        else{
            StackNode<E>current=head;
            StackNode<E>prev=head;
            while(current.next!=null){
                prev=current;
                current=current.next;
            }
            prev.next=null;
            tail=prev;
            size--;
            return current.element;
        }
    }
    
    //pop middle
    public E popMiddle(){
        E removed=null;
        StackNode<E>prev=head;
        if(size%2!=0){
           for(int i=0;i<size/2-1;i++){
               prev=prev.next;
           }
           removed = (E) prev.next.element;
           prev.next=prev.next.next;
           size--;
        }else{
            System.out.println("Current count of stack is even number, so no middle index...");
        }
        return removed;
    }
    
    //popAll
    public void popAll(){
        if(isEmpty()){
            System.out.println("The stack is already empty, nothing to remove");
        }else{
            System.out.println("There are "+size+" items in the stack. Pop all...");
            while(!isEmpty())
                System.out.println("Removing "+pop()+" ..");
        }  
    }

    //display
    public void display(){
        if(isEmpty())
            System.out.println("\nStack is empty, nothin to display...\n");
        else{
            String output="";
            System.out.println("\nThere are "+size+" items in the stack. Displaying...");
            StackNode<E>current=head;
            while(current!=null){
                output=current.element+"\n"+output;
                current=current.next;
            }
            System.out.println(output);
        }
    }
}
