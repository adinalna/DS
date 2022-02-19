/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2017;

/**
 *
 * @author adina
 */
public class LinkedList {
    private int size;
    Node head,tail;

    //default constructor
    public LinkedList() {
        size=0;
        head=null;
        tail=null;
    }
    
    //To insert a new element into the linked list
    public void insertFirstLink(String brand, int sold){
        Node newNode = new Node(brand,sold);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    
    //To insert a new element after a particular element in the linked list
    public void addAfter(String before, String after, int sold){
        System.out.println("Adding "+after+" after "+before);
        Node newNode = new Node(after,sold);
        Node prev = head;
        int index=0;
        while(prev!=null){
            if(prev.brand.equals(before))
                break;
            index++;
            prev=prev.next;
        }
        if(prev!=null){
            Node current=prev.next;
            prev.next=newNode;
            newNode.next=current;
            size++;
            System.out.println("Found "+before+" which is handbag number "+(index+1)+" in the linked list\n");
        }else{
            System.out.println("No match found for "+before+"\n");
        }
    }
    
    //To delete any element in the linked list
    public void removeLink(String brand){
        System.out.println("Removing "+brand+"..");
        Node current = head;
        Node prev=current;
        int index=0;
        while(current!=null){
            if(current.brand.equals(brand))
                break;
            index++;
            prev=current;
            current=current.next;
        }
        if(current!=null){
            prev.next=current.next;
            size--;
            System.out.println("Found a match.."+brand+" is handbag number "+(index+1)+" in the linked list\n");
        }else{
             System.out.println("No match found for "+brand+"\n");
        }
    }
    
    //To display a;; of the contents of the linked list
    public void display(){
        System.out.println("Displaying the Linked List*************************************");
        Node current = head;
        while(current!=null){
            System.out.println(current.brand+": "+current.sold+",000,000 sold");
            current=current.next;
        }
        System.out.println();
    }
}
