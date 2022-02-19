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
public class SinglyLinkedListFinals<E> {
    private int size;
    Node<E> head;
    Node<E> tail;
    
    public SinglyLinkedListFinals() {
        head=null;
        tail=null;
        size=0;
    }
     
    public void add(E e){
        Node<E>newNode=new Node<>(e);
        if(tail==null){
             head=tail=newNode;
        }else{
           tail.next= newNode;
           tail=newNode;
        }
        System.out.println("Adding: "+e);
        size++;
    }
    
    public void addAfter(E after,E before){
        Node<E>newNode=new Node<>(after);
        Node<E>prev=head;
        while(prev!=null){
            if(prev.element==before)
                break;
            prev=prev.next;
        }
        Node<E>current=prev.next;
        prev.next=newNode;
        newNode.next=current;
        size++;
        System.out.println("Adding "+after+" after "+before);
    }
    
    public E deleteFront(){
        if(size==0){
             return null;
        }
        Node<E> temp = head; 
        head=head.next;
        if (head == null){
            tail = null; 
        }
        size--;
        System.out.println("\nDeleting front: "+temp.element);
        return temp.element;
    }
       
    //To delete an element after element with value x in the linked list
    public void deleteAfter(E x){
        System.out.println("\nTesting deleteAter:");
        Node<E>prev=head;
        while(prev!=null){
            if(prev.element==x)
                break;
            prev=prev.next;
        }
        if(prev!=null){
            Node<E>current=prev.next;
            prev.next=current.next;
            size--;
            System.out.println("After "+x+" is "+current.element+". Deleting "+current.element);
        }else{
            System.out.println("Element ("+x+") not found...");
        }
    }
      
    //Print all the elements in the list
    public void traverse(){
        System.out.println("\nShowuing content of my linked list:");
        Node<E> current = head; 
        while(current != null) {
            System.out.print(current.element+" ");
            current = current.next;
        }
        System.out.println();
    }
    

    
   
    
}
