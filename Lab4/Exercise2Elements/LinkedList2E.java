/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2Elements;

/**
 *
 * @author adina
 */
public class LinkedList2E<E,T> {
    Node<E,T>head;
    Node<E,T>tail;
    private int size;

    public LinkedList2E() {
        head=null;
        tail=null;
        size=0;
    }
    
    public void addFirst(E e1, T e2){
        Node<E,T>newNode=new Node<>(e1,e2);
        if(size==0)
            head=tail=newNode;
        else{
            Node<E,T>temp=head;
            head=newNode;
            newNode.next=head;
        }
        size++;
    }
    
    public void addLast(E e1, T e2){
        Node<E,T>newNode=new Node<>(e1,e2);
        if(size==0)
            head=tail=newNode;
        else{
            Node<E,T>temp=tail;
            tail=newNode;
            temp.next=tail;
        }
        size++;
    }
    
    public void add(E e1, T e2){
        addLast(e1,e2);
        System.out.println("Add: "+e1+", RM "+e2);
    }
    
    public void addIndex(int index,E e1,T e2){
        Node<E,T>newNode=new Node<>(e1,e2);
        if(index<0||index>size){
            System.out.println("Invalid index");
        }else if(index==0){
            addFirst(e1,e2);
        }else if(index==size-1){
            addLast(e1,e2);
        }else{
            Node<E,T>current=head;
            for(int i=0;i<index-1;i++){
                current=current.next;
            }
            newNode.next=current.next;
            current.next=newNode;
            size++;
        }
    }
    
    public void removeFirst(){
        E temp1=head.element1;
        T temp2=head.element2;
        Node<E,T>removed=head;
        head=head.next;
        removed=null;
        size--;
        if(tail==null)
            
        System.out.println("Removed: "+temp1+", "+temp2);    
    }
    
    public void removeLast(){
        E temp1=tail.element1;
        T temp2=tail.element2;
        Node<E,T>removed=tail;
        tail=tail.next;
        removed=null;
        size--;
        System.out.println(temp1+", "+temp2);    
    }
    
    public void remove(int index){
        Node<E,T>current=head;
        for(int i=0;i<index-1;i++){
            current=current.next;
        }
        E temp1 = current.element1;
        T temp2 = current.element2;
        Node<E,T>removed = current.next;
        current.next=removed.next;
        removed=null;
        size--;
        System.out.println(temp1+", "+temp2);    
    }
    
    public void print(){
        Node<E,T>current=head;
        System.out.print("All elements: ");
        while(current!=null){
            System.out.print("("+current.element1+", "+current.element2+"), ");
            current=current.next;
        }
        System.out.println();
    }
    
    
}
