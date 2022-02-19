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
public class Queue<E> {
    private int size;
    private final int capacity;
    QueueNode<E>head,tail;
    
    //constructor with capacity parameter
    public Queue(int capacity) {
        this.capacity = capacity;
        size=0;
        head=null;
        tail=null; 
    }
    
    //Return whether or not the queue is empty
    public boolean isEmpty(){
        return head==null;
    }
    
    //Return the value of the first element in the queue
    public E peek(){
        if(isEmpty()){
            return null;
        }else{
            System.out.println("Peek(): "+tail.element);
            return tail.element;
        }
    }
    
    //Add element to the bottom of the queue
    public void enqueue(E e){
        QueueNode<E>newNode=new QueueNode<>(e);
        if(isEmpty()){
            System.out.println("Data "+e+" is inserted");
            head =tail= newNode;
            size ++;
        }else if(capacity==size){
            System.out.println("Queue is full");
        }else{
            System.out.println("Data "+e+" is inserted");
            tail.next=newNode;
            tail=newNode;
            size ++;
        }
    }
    
    //Remove elemnt from the top of the queue
    public E dequeue(){
        if(isEmpty())
            return null;
        else if(size==1){
            E removed = tail.element;
            head=tail=null;
            size--;
            System.out.println("Data "+removed+" has been removed");
            return removed;
        }
        else{
            E removed = head.element;
            head=head.next;
            size--;
            System.out.println("Data "+removed+" has been removed");
            return removed;
        }
    }
    
    //Display all elements in the queue
    public void display(){
        String indexOutput = "";
        String elementOutput = "";
        //Set the indexOutput
        for(int i=0;i<size;i++)
            indexOutput+="| "+i+" ";
        indexOutput+="|";
        //Set the elementOutput
        QueueNode<E>temp=head;
        while(temp!=null){
            elementOutput+="| "+temp.element+" ";
            temp=temp.next;
        }
        elementOutput+="|";
        System.out.println("-----------------------------------------------------");
        System.out.println(indexOutput);
        System.out.println("-----------------------------------------------------");
        System.out.println(elementOutput);
        System.out.println("-----------------------------------------------------");
    }
}
