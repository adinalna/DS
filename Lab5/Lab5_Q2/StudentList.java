/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5_Q2;

/**
 *
 * @author adina
 */
public class StudentList<E> {
    private int size;
    KNode<E>head;
    KNode<E>tail;

    public StudentList() {
        head=null;
        tail=null;
        size=0;
    }
    
    
    public void add(E e){
        addLast(e);
    }
    
    //Add node at the at the last as tail
    public void addLast(E e){
        KNode<E>newNode=new KNode<>(e);
        if(head==null)
            head=tail=newNode;
        else{
            tail.next=newNode;
            tail=newNode;
        }         
        size++;
    }
    
    public void removeElement(E e){
        if(e.equals(head.element)){
            removeFirst();
        }else{
            KNode<E>current=head;
            for(int i=0;i<size;i++){
                if(current.element.equals(e)){
                    remove(i);
                }
                current=current.next;
            }
        }
    }
    
    public void removeFirst(){
        KNode<E>removed=head;
        head=head.next;
        System.out.println("Removed "+removed.element);
        size--;
        if(head==null){
            tail=null;
        }
    }
    
     public void removeLast(){
         KNode<E>current=head;
         for(int i=0;i<size-2;i++){
             current=current.next;
         }
         System.out.println("Removed "+tail.element);
         tail=current;
         tail.next=null;
         size--;    
     }
    
    public void remove(int index){
        if(index<0||index>=size){
            System.out.println("Invalid index to be removed");
        }else if(index==0){
            removeFirst();
        }else if(index==size-1){
            removeLast();
        }else{
            KNode<E>previous=head;
            for(int i=0;i<index-1;i++){
                previous=previous.next;
            }
            KNode<E>current=previous.next;
            previous.next=current.next;
            System.out.println("Removed "+current.element);
            size--;
        }
    }
    
    public void printList() {
        KNode<E>current=head;
        for(int i=0;i<size;i++){
            if(i==size-1){
                System.out.println(current.element+".\n");
            }else{
            System.out.print(current.element+", ");
            current=current.next;
            }
        }
    }
    
    public int getSize(){
        int sizeCheck=0;
        KNode<E>current=head;
        while(current!=null){
            current=current.next;
            sizeCheck++;
        }
        return sizeCheck;
    }
    
    public boolean contains(E e){
        boolean found=false;
        KNode<E>current=head;
        for(int i=0;i<size;i++){
            if(current.element.equals(e)){
                found=true;
            }
        }
        return found;
    }
    
    public void replace(E e, E newE) {
       KNode<E>current=head;
       for(int i=0;i<size;i++){
           if(current.element.equals(e)){
               current.element=newE;
               break;
           }
           current=current.next;
       }
    }
}
