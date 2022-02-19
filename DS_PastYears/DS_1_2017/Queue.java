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
public class Queue<Item> {
    private int size;
    QueueNode<Item>head,tail;
    
    //default constructor
    public Queue() {
        head=null;
        tail=null;
    }
   //Return whether or not the queue i empty 
    public boolean isEmpty(){
        return head==null;
    }
    
    //Return the size of the queue
    public int size(){
        return size;
    }
    
    //Return the value of the first element
    public Item peek(){
        if(isEmpty()){
            return null;
        }else{
            return head.element;
        }
    }
    
    //Add element to the bottom of the queue
    public void enqueue(Item e){
        QueueNode<Item>newNode=new QueueNode<>(e);
        if(isEmpty()){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    
    //Remove element from the top of the queue
    public Item dequeue(){
        if(isEmpty()){
            return null;
        }else if (size==1){
            Item removed=head.element;
            head=tail=null;
            size--;
            return removed;
        }else{
            Item removed=head.element;
            head=head.next;
            size--;
            return removed;
        }
    }
    
    //Print the elements of the queue
    @Override
    public String toString(){
        String output="";
        QueueNode<Item>current=head;
        while(current!=null){
            output+=current.element+" ";
            current=current.next;
        }
        return output;
    }
    
    public void ChangeOrder(int k){
        for(int i=0;i<k-1;i++){
            enqueue(dequeue());
        }
    }
}
