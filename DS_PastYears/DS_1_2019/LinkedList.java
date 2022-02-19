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
public class LinkedList<E,T> {
    int size=0;
    Node<E,T>head;
    Node<E,T>tail;
    
    //Constructor for the node
    public LinkedList() {
        size=0;
        head=null;
        tail=null;
    }
    
    //isEmpty
    public boolean isEmpty(){
        return size==0;
    }
    
    //addLast
    public void addFirst(E subject,T creditHour){
        Node<E,T>newNode=new Node<>(subject,creditHour);
        if(size==0)
            head=tail=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }
        size++;
    }
    
    //add
    public void add(E subject,T creditHour){
        addFirst(subject,creditHour);
    }
    
    //getIndex
    public int getIndex(E subject){
        Node<E,T>temp=head;
        for(int i=0;i<size;i++){
            if(temp.subject==subject)
                return i;
            temp=temp.next;
        }
        return -1;
    }
    
    //addAfter
    public void addAfter(E afterSubject,E subject,T creditHour){
        Node<E,T>newNode=new Node<>(subject,creditHour);
        Node<E,T>temp=head;
        while(!temp.subject.equals(afterSubject)){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
        System.out.println("\nAdding "+subject+" after "+afterSubject);
    }
    
    //removeFist
    public void removeFirst(){
        if(size==1)
            head=tail=null;
        else{
            System.out.println("\nRemoving "+head.subject+"..");
            Node<E,T>removed=head;
            head=head.next;
            removed=null;
        }
        size--;
    }
    
    //removeLast
    public void removeLast(){
        if(size==1)
             head=tail=null;
        else{
            Node<E,T>temp=head;
            for(int i=0;i<size-2;i++){
                temp=temp.next;
            }
            Node<E,T>removed=temp.next;
            temp.next=null;
            System.out.println("\nRemoving "+removed.subject+"..");
            removed=null;    
        }
        size--;
    }
    
    public void remove(E subject,T creditHour){
        int index=getIndex(subject);
        if(index<0||index>size-1)
            System.out.println("\nSubject does not exist in the linked list");
        else if(index==1)
            removeFirst();
        else if(index==size-1)
            removeLast();
        else{
            Node<E,T>temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            Node<E,T>removed=temp.next;
            temp.next=removed.next;
            System.out.println("\nRemoving "+removed.subject+"..");
            removed=null;
            size--;
        }
    }
    
    //display
    public void display(){
        System.out.println("\nDisplaying the Linked List -----------------------\n");
        Node<E,T>temp=head;
        String output="";
        while(temp!=null){
            output=output+temp.subject+": "+temp.creditHour+" hours\n";
            temp=temp.next;
        }
        System.out.print(output);
    }
    
    //totalCreditHours
    public void totalCreditHours(){
        int total=0;
        Node<E,T>temp=head;
        while(temp!=null){
            total+=(int)temp.creditHour;
            temp=temp.next;
        }
        System.out.println("\nTotal credit hours: "+total);
    }
            
}
