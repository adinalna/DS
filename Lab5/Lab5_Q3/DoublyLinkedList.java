/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5_Q3;

/**
 *
 * @author adina
 */
public class DoublyLinkedList<E> {
    private int size;
    private DNode<E> head;
    private DNode<E> tail;

    public DoublyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    
    public void add(E e){
        addLast(e);
    }
    
    public void addFirst(E e){
        DNode<E> newNode = new DNode(e,head,null);
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;
        if(tail==null){
            tail=newNode;
        }
        size++;
        System.out.println("Adding: "+e);
    }
    
    public void addLast(E e){
        DNode<E> newNode = new DNode(e,null,tail);
        if(tail!=null){
            tail.next=newNode;
        }
        tail=newNode;
        if(head==null){
            head=newNode;
        }
        size++;
        System.out.println("Adding: "+e);
    }
    
    public void addMiddle(int index, E e){
        if(index<0||index>size)
            System.out.println("Invalid index for node addition");
        else if(index==0)
            addFirst(e);
        else if(index==size)
            addLast(e);
        else{
            DNode<E>current=head;
            for(int i=0;i<index;i++){
                current=current.next;
            }
            DNode<E>newNode=new DNode<>(e,current,current.prev);
            current.prev.next=newNode;
            current.prev=newNode;
            size++;
            //System.out.println("Adding new node at index "+index+" with element "+e);
            }
    }
    
    //Display all elements forward
    public void iterateForward(){
        System.out.println("Interating forward..");
        DNode<E>current=head;
        while(current!=null){
            System.out.print(current.element+" ");
            current=current.next;
        }
        System.out.println();
    }
    
    //Display all elements backward
    public void iterateBackward(){
        System.out.println("Interating backward..");
        DNode<E>current=tail;
        while(current!=null){
            System.out.print(current.element+" ");
            current=current.prev;
        }
        System.out.println();
    }
    
    public E removeFirst(){
        DNode<E>tmp=head;
        if(size==0){
            System.out.println("No such element in list");
            return null;
        }else{
            head=head.next;
            head.prev=null;
            size--;
            //if(head==null)
                //tail=null;
        }
        System.out.println("Deleted: "+tmp.element);
        return tmp.element;
    }
    
    public E removeLast(){
        DNode<E>tmp=tail;
        if(size==0){
            System.out.println("No such element in list");
            return null;
        }else{
            tail=tail.prev;
            tail.next=null;
            size--;
            System.out.println("Deleted: "+tmp.element);
            //if(tail==null)
               // head=null;
        }
        return tmp.element;
    }
    
    public E remove(int index){
        E element=null;
        if(index<0||index>=size){
            System.out.println("No such element in list");
        }
        else if(index==0){
            removeFirst();
        }
        else if(index==size-1){
            removeLast();
        }else{
            DNode<E>current=head;
            for(int i=0;i<index;i++){
                current=current.next;
            }
            element=current.element;
            current.prev.next=current.next;
            current.next.prev=current.prev;
            current.prev=null;
            current.next=null;
            size--;
        }
        return element;
    }
    
    public void clear(){
        DNode<E>tmp=head;
        int thesize=0;
        while(head!=null){
            tmp=head.next;
            head.prev=head.next=null;
            head=tmp;
            thesize++;
        }
        tmp=null;
        tail.prev=tail.next=null;
        size=0;
        System.out.println("succesfully clear "+thesize+" node(s)");
    }
    
     public int getSize(){
        int sizeCheck=0;
        DNode<E>current=head;
        while(current!=null){
            current=current.next;
            sizeCheck++;
        }
        return sizeCheck;
    }         
}
        
   
