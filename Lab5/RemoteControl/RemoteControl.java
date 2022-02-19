/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoteControl;


/**
 *
 * @author adina
 */
public class RemoteControl<E> {
    private int size;
    RNode<E>head;
    RNode<E>tail;
    RNode<E>currentChannel;

    public RemoteControl() {
        head=null;
        tail=null;
        currentChannel=null;
        size=0;
    }
    
    public void add(E e){
        addLast(e);
    }
    
    public void addFirst(E e){
        RNode<E> newNode = new RNode(e,head,tail);
        if(head!=null){
            head.prev=newNode;
            tail.next=newNode;
        }
        head=newNode;
        if(tail==null){
            tail=newNode;
        }
        size++;
        System.out.println("Adding: "+e);
    }
    
    public void addLast(E e){
        RNode<E> newNode = new RNode(e,head,tail);
        if(tail!=null){
            tail.next=newNode;
            head.prev=newNode;
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
            System.out.println("Invalid index for channel for addition");
        else if(index==0)
            addFirst(e);
        else if(index==size)
            addLast(e);
        else{
            RNode<E>current=head;
            for(int i=0;i<index;i++){
                current=current.next;
            }
            RNode<E>newNode=new RNode<>(e,current,current.prev);
            current.prev.next=newNode;
            current.prev=newNode;
            size++;
            //System.out.println("Adding new node at index "+index+" with element "+e);
            }
    }
     
    //Display all elements forward
    public void displayForward(){
        System.out.println("\n-All available channels-");
        RNode<E>current=head;
        for(int i=0;i<size;i++){
            System.out.println(current.element+" ");
            current=current.next;
        }
        System.out.println();
    }
   
    public E removeFirst(){
        RNode<E>tmp=head;
        if(size==0){
            System.out.println("All channels backwards:");
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
        RNode<E>tmp=tail;
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
            System.out.println("No such channel in available");
        }
        else if(index==0){
            removeFirst();
        }
        else if(index==size-1){
            removeLast();
        }else{
            RNode<E>current=head;
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
        RNode<E>tmp=head;
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
        System.out.println("succesfully clear "+thesize+" all channel(s)");
    }
    
     public int getSize(){
        int sizeCheck=0;
        RNode<E>current=head;
        while(current!=null){
            current=current.next;
            sizeCheck++;
        }
        return sizeCheck;
    }     
     
    //Get the index of element
     public int getIndex(E e){
         int index=-1;
         RNode<E>current=head;
         for(int i=0;i<size;i++){
            if(current.element.equals(e)){
                 index=i;
                 break;
            }
             current=current.next;
        }
        return index;
     }
     
    //To move forward or backward in channel list
    public E nextChannel(char nextCh){
        if(currentChannel==null)
            currentChannel=head;
        if(nextCh=='+'){
            currentChannel=currentChannel.next;
        }
        else if(nextCh=='-'){
            currentChannel=currentChannel.prev;
        }
        return currentChannel.element;
    }
    
    //Go to a new channel as the new current channel
    public E newCurrentChannel(int index){
        RNode<E>current=head;
        for(int i=0;i<index;i++){
            current=current.next;
        }
        currentChannel=current;
        return current.element;
    }
    
}


