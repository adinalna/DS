/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2019;

/**
 *
 * @author adina
 */
public class MyLinkedList<E> {
    //Declare 3 attributes named head, tail and size
    private int size;
    Node<E>head;
    Node<E>tail;
    
    //A default constructor 
    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    
    //getsize method to return the size of linked list
    public int getSize(){
        return size;
    }
    
    //addFirst method that adds a node to the first position and returns nothing
    public void addFirst(E e){
        Node<E>newNode = new Node<>(e);
        if(head==null)
            head=tail=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }
        size++;    
    }
    
    //addLast method that adds a node to the last position and returns nothing
    public void addLast(E e){
        Node<E>newNode = new Node<>(e);
        if(tail==null)
            head=tail=newNode;
        else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;    
    }
    
    //add method
    public void add(E e){
        addLast(e);
    } 
    
    //removeFirst method that removes the first node and returns nothing
    public void removeFirst(){
        if(size==1){
            head=tail=null;
        }else{
            Node<E>Removed=head;
            head=head.next;
            Removed=null;
        }
        size--;
    }
    
   //method to get an element of a specific index
    public E get(int index){
        Node<E>current=head;
        for(int i=0;i<index;i++)
            current=current.next;
        return current.element;
    }
    
    //method to set/change an element in an existing node of a specofic index
    public void set(int index,E e){
        Node<E>current=head;
        for(int i=0;i<index;i++){
            current=current.next;
        }
        current.element=e;
    }
    
    public String toString(){
        String output="";
        Node<E>temp=head;
        while(temp!=null){
            output+=" >> "+temp.element;
            temp=temp.next;
        }
        return "[size="+getSize()+"]"+output;
    }
}
