/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2018;

/**
 *
 * @author adina
 */
public class LList<E,T> {
    private int size;
    Node<E,T>head,tail;
    
    //default constructor
    public LList() {
        size=0;
        head=null;
        tail=null;
    }
    //Return whether or not the stack is empty
    public boolean isEmpty(){
        return size==0;
    }
    
    //Add element on top of the stack
    public void add(E subject,T credit){
        Node<E,T>newNode=new Node<>(subject,credit);
        if(head==null)
            head=tail=newNode;
        else{
            Node<E,T>temp=head;
            head=newNode;
            head.next=temp;
        }
        size++;
    }
    
    public void addAfter(E before,E after,T credit){
        System.out.println("\nAdding "+after+" after "+before);
        Node<E,T>newNode=new Node<>(after,credit);
        Node<E,T>prev=head;
        int index=0;
        while(prev!=null){
            if(prev.subject==before)
                break;
            else{
                index++;
                prev=prev.next;
            }
        }
        System.out.println("Found "+before+" which is book number "+(index+1)+" in the linked list");
        Node<E,T>temp=prev.next;
        prev.next=newNode;
        newNode.next=temp;
        size++;
    }
    
    public void remove(E subject,T credit){
        Node<E,T>temp=head;
        Node<E,T>prev=head;
        int index=0;
        while(temp!=null){
            if(temp.subject==subject&&temp.credit==credit)
                break;
            else{
                index++;
                prev=temp;
                temp=temp.next;
            }
        }
        Node<E,T>removed=prev.next;
        prev.next=prev.next.next;
        size--;
        removed=null;
        System.out.println("\nRemoving "+subject+"..");
        System.out.println("Found a match.."+subject+" is book number "+(index+1)+" in the linked list");
    }
    
    public void display(){
        System.out.println("\nDisplaying the Linked List *********************************\n");
        Node<E,T>temp=head;
        while(temp!=null){
            System.out.println(temp.subject+": "+temp.credit+" hours");
            temp=temp.next;
        }
    }
    
    //to get the the total credit hours collected
    public void totalCreditHours(){
        int total=0;
        Node<E,T>temp=head;
        while(temp!=null){
            total+=(Integer)temp.credit;
            temp=temp.next;
        }
        System.out.println("Total credit hours taken: "+total);
    }
}
