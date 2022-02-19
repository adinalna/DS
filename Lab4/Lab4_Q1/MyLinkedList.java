/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4_Q1;

/**
 *
 * @author adina
 */
public class MyLinkedList<E> {
    private int size;
    Node<E> head;
    Node<E> tail;
    
    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    
    public int mainsize(){
        return size;
    }
    //To recheck and confirm the size
    public int getSize(){
        int thesize=0;
        Node<E>current=head;
        while(current!=null){
            current=current.next;
            thesize++;
        }
        return thesize;
    }
    
    public void addFirst(E e){
         Node<E> newNode = new Node<>(e);
         newNode.next=head;
         head=newNode;
         size++;
         if(tail==null)
             tail=head;
     }
     
     public void addLast(E e){
         Node<E>newNode=new Node<>(e);
         if(tail==null){
             head=tail= newNode;
         }else{
            tail.next= newNode;
            tail=newNode;
         }
         System.out.println(e);
         size++;
    }
    
    public void add(int index, E e){
         Node<E> newNode = new Node<>(e);
         Node<E>current=head;
         for(int i=1;i<index;i++){
             current=current.next;
         }
         Node<E>temp=current.next;
         current.next=newNode;
         newNode.next=temp;
         size++;
    }
     
    public E removeFirst(){
        if(size==0){
             return null;
        }
        Node<E> temp = head; 
        head=head.next;
        if (head == null){
            tail = null; 
        }
        size--;
        return temp.element;
    }
       
    public E removeLast(){
        Node<E> current = head; 
        for (int i = 0; i < size - 2; i++){
            current = (Node<E>) current.next; 
        }
        Node<E>temp=tail;
        tail=current;
        size--;
        return temp.element;
    }
     
    public E remove(int index){
        if(index<0||index>=size)
            return null;
        else if(index==0)
            removeFirst();
        else if(index==size-1)
            removeLast();
        else{
             Node<E> previous = head;
        for (int i = 0; i <index-1; i++){
            previous = previous.next; 
        }
        Node<E>current=previous.next;
        previous.next=current.next;
        size--;
        return current.element;
        }
        return null;
    }
    
    //Return nothing, but adds an element to the list
    //shorcut using addLast()
    public void add(E e){
        addLast(e);
    }
    
    //Return nothing, but adds an element to the list
    public boolean contains(E e){
        Node<E> current = head; 
        boolean found=false;
        for (int i = 0; i <size; i++){
                if(current.element.equals(e)){
                found=true;
            }
        current = current.next; 
        }
        return found;
    }
    
    //Return element at the specified index
    public E get(int index){
        Node<E> current = head; 
        for (int i = 0; i <index; i++){
            current = current.next; 
        }
        return current.element;
    }
    
    //Return the value of the first item
    public E getFirst(){
        return head.element;
    }
    
    //Return the value of the first item
    public E getLast(){
        return tail.element;
    }
    
    //Return the index of the head matching element in this 
    //list. Return -1 of no match
    public int indexOf(E e){
        int index=-1;
        Node<E> current = head; 
        for (int i = 0; i<size; i++){
            if(current.element.equals(e)){ 
                index=i;
                break;
            }
            current = (Node<E>) current.next;
        }
        return index;
    }
    
    //Replace the element at the specified position in this 
    //list with the specified element
    public E set(int index,E e){
        Node<E> newNode = new Node<>(e);
        if(index<0||index>=size){
            System.out.println("invalid index for modification");
        }
        else if(index==0){
            Node<E> removed=head;
            newNode.next=head.next;
            head =newNode;
            return removed.element;
        }else{
        Node<E> previous = head; 
        for (int i = 0; i<index-1; i++){
            previous = previous.next;
        }
        Node<E> current = previous.next;
        previous.next=newNode;
        newNode.next=current.next;
        return current.element;
        }
        return null;
    }
    
    //clear list
    public void clear(){    
        head = tail = null;
    }
    
    //Print all the elements in the list
    public void print(){
        Node<E> current = head; 
        String output="All elements: ";
        while(current != null) {
            output = output + current.element;
            current = current.next;
        }
        System.out.println(output);
    }
    
    //Print all elements in reverse order
    public void reverse(){
        Node<E> current = head; 
        System.out.print("Elements in reverse: ");
        String reverse ="";
        while(current != null) {
            reverse = current.element + reverse;
            current = current.next;       
        }
        System.out.println(reverse);
    }
    
    //For question 2
    public E getMiddleValue(){
        int middleIndex = getSize()/2;
        return get(middleIndex);
    }
    
}
