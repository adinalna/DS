/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SList;

/**
 *
 * @author adina
 */
public class SList<E> {
    E element;
    private int size;
    SNode<E> head;
    SNode<E> tail;

    public SList() {
        head=null;
        tail=null;
        size=0;
    }
    
    //add node 
    public void add(E e){
        appendEnd(e);
        System.out.println(e);
    }
  
    //Append a new element at the end of the list. 
    public void appendEnd(E e){
        SNode<E>newNode=new SNode<>(e);
        if(tail==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    
    //Eliminate the first element in the list.
    public E removeInitial(){
        SNode<E>temp=head;
        if(size==0){
            return null;     
        }else{    
            head=head.next;
            if (head == null){
                tail = null; 
            }
            size--;
        }
         return temp.element;
    }
    
    //Search for an element and returns true if this list contains the searched element 
    public boolean contains(E e){
        SNode<E>current=head;
        boolean found=false;
        for(int i=0; i<size; i++){
            if(current.element.equals(e)){
                found=true;
                break;
            }
            current=current.next;
        }
        return found;
    }
    
    //Empty all elements in the list and return a statement that 
    //reports that the list is empty.
    public void clear(){
        head=tail=null;
    }

    //Display all values from the list in a successive order.
    public void display(){
        String output="";
        SNode<E>current=head;
        while(current!=null){
            output=output+" "+current.element;
            current=current.next;
        }
        System.out.println(output);
    }
    
    public E removeElement(E e){
        SNode<E>current=head;
        if(e==head.element){
            removeInitial();
        }else{
        for(int i=0;i<size;i++){
            if(current.element.equals(e)){
                remove(i);             
            }
        current=current.next;}
        }
        return current.element; 
    }
    
    public E remove(int index){
        if(index<0||index>=size)
            return null;
        else if(index==0)
            removeInitial();
        else if(index==size-1)
            removeLast();
        else{
             SNode<E> previous = head;
        for (int i = 0; i <index-1; i++){
            previous = previous.next; 
        }
        SNode<E>current=previous.next;
        previous.next=current.next;
        size--;
        return current.element;
        }
        return null;
    }
    
     public E removeLast(){
        SNode<E> current = head; 
        for (int i = 0; i < size - 2; i++){
            current = current.next; 
        }
        SNode<E>temp=tail;
        tail=current;
        size--;
        return temp.element;
    }
}
