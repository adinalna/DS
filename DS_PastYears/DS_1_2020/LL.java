/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2020;

/**
 *
 * @author adina
 */
public class LL<E,T> {
    int size;
    Node<E,T>head;
    Node<E,T>tail;

    public LL() {
        size=0;
        head=null;
        tail=null;
    }
    
    //isEmpty 
    public boolean isEmpty(){
        return size==0;
    }
    
    //add
    public void add(E movie,T sold){
        Node<E,T>newNode=new Node<>(movie,sold);
        if(head==null)
            head=tail=newNode;
        else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    
    //createNode
    public void createNode(E movie,T sold){
        add(movie,sold);
    }
    
    //getIndex
    public int getIndex(E movie){
        Node<E,T>temp=head;
        for(int i=0;i<size;i++){
            if(temp.movie.equals(movie))
                return i;
            temp=temp.next;
        }
        return -1;
    }
    
    
    //addAfter
    public void addAfter(E afterMovie,E movie,T sold){
        Node<E,T>newNode=new Node<>(movie,sold);
        Node<E,T>temp=head;
        int index=getIndex(afterMovie);
        for(int i =0;i<index-1;i++){
            temp=temp.next;
        }
        Node<E,T>prev=temp.next;
        temp.next=newNode;
        newNode.next=prev;
        size++;
        System.out.println("Adding "+movie+" after "+afterMovie);
        System.out.println("Found "+afterMovie+" which is book number "+(size-index-1)+" in the linked list");
        display();
    }
    
    //removeFirst
    public void removeFirst(){
        Node<E,T>removed=head;
        if(size!=1){
            head=head.next;
        }
        System.out.println(removed.movie+" is the first book. Removing "+removed.movie+" from the linked list");
        removed=null;
        if(head==null)
            tail=null;
        size--;
    }
    
    //removeLast
    public void removeLast(){
        Node<E,T>removed=tail;
        Node<E,T>temp=head;
        if(size!=1){
            for(int i=0;i<size-2;i++){
                temp=temp.next;
            }
            tail=temp;
            tail.next=null;
        }
        System.out.println(removed.movie+" is the last book. Removing "+removed.movie+" from the linked list");
        removed=null;
        if(tail==null)
            head=null;
        size--;

    }
    //remove
    public void remove(E movie){
        System.out.println("\nRemoving "+movie+"..");
        int index=getIndex(movie);
        if(index==0)
            removeFirst();
        else if (index==size-1)
            removeLast();
        else if(index!=-1){
            Node<E,T>temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            Node<E,T>removed=temp.next;
            temp.next=removed.next;
            System.out.println(removed.movie+" is book number "+(index+1)+". "
                    + "Removing "+removed.movie+" from the linked list");
            removed=null;
            size--;
        }else{
            System.out.println("Couldn't find bookname..");
        }
    }
    
    //removeNode
    public void removeNode(E movie){
        remove(movie);
    }
    
    //display
    public void display(){
        if(isEmpty())
            System.out.println("\nThe Linked List is empty");
        else{
            System.out.println("\nDisplaying the Linked List*******************************\n");
            String output="";
            Node<E,T>temp=head;
            while(temp!=null){
                output=temp.movie+": "+temp.sold+",000,000 Sold\n"+output;
                temp=temp.next;
            }
            System.out.println(output);
        }
    }
    
    //totalsold
    public int totalSold(){
        int total=0;
        Node<E,T>temp=head;
            while(temp!=null){
                total+=(int)temp.sold;
                temp=temp.next;
            }
        return total;
    }
}
