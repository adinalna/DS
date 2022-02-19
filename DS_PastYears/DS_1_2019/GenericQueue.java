/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2019;


/**
 *
 * @author adina
 */
public class GenericQueue<E> {
   private int size;
   private final int capacity;
   QueueNode<E>head,tail;
    
    //Constructor for the generic queue class
    public GenericQueue(int capacity) {
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
    
    //enqueue
    public void enqueue(E e){
        QueueNode<E>newNode=new QueueNode<>(e);
        if(isEmpty()){
            System.out.println("Enqueue: "+e);
            head =tail= newNode;
            size ++;
        }else if(isFull()){
            System.out.println("Queue is full");
        }else{
            System.out.println("Enqueue: "+e);
            tail.next=newNode;
            tail=newNode;
            size ++;
        }
    }
    
    //enqueueMany
    public void enqueueMany(String allE){
        if(!isFull()){
            E[]many=(E[]) allE.split(",");
            for(E e:many){
                if(!isFull()){
                    enqueue(e);
                }else{
                    System.out.println("Queue is full");
                    break;
                }
            }
        }else{
             System.out.println("Queue is full");
        }
    }
    
    //dequeue
    public E dequeue(){
        if(isEmpty())
            return null;
        else if(size==1){
            E removed = tail.element;
            head=tail=null;
            size--;
            System.out.println("Dequeue: "+removed);
            return removed;
        }
        else{
            E removed = head.element;
            head=head.next;
            size--;
            System.out.println("Dequeue: "+removed);
            return removed;
        }
    }
    
    //dequeueAll
    public void dequeueAll(){
        if(isEmpty()){
            System.out.println("The queue is already empty, nothing to remove");
        }else{
            System.out.println("\nThere are "+size+" items in the queue. Removing them all...");
            while(!isEmpty())
                dequeue();
        }  
    }
    
    //display
    public void display(){
        if(isEmpty())
            System.out.println("\nNothing to display");
        else{
            System.out.println("\nThere are "+size+" items in the queue. Displaying...");
            QueueNode<E>temp=head;
            while(temp!=null){
                System.out.print(temp.element+"|");
                temp=temp.next;
            }
            System.out.println();
        }
    }
}
