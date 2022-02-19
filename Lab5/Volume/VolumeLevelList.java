/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Volume;

/**
 *
 * @author adina
 */
public class VolumeLevelList<E> {
    private int size;
    VNode<E>head;
    VNode<E>tail;
    VNode<E>currentLevel;

    public VolumeLevelList() {
        head=null;
        tail=null;
        currentLevel=null;
        size=0;
    }
    
    public void add(E e){
        addLast(e);
    }
    
    public void addFirst(E e){
        VNode<E> newNode = new VNode(e,head,null);
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
        VNode<E> newNode = new VNode(e,null,tail);
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
            System.out.println("Invalid index for channel for addition");
        else if(index==0)
            addFirst(e);
        else if(index==size)
            addLast(e);
        else{
            VNode<E>current=head;
            for(int i=0;i<index;i++){
                current=current.next;
            }
            VNode<E>newNode=new VNode<>(e,current,current.prev);
            current.prev.next=newNode;
            current.prev=newNode;
            size++;
            //System.out.println("Adding new node at index "+index+" with element "+e);
            }
    }
     
    //Display all elements forward
    public void displayForward(){
        System.out.println("\n-All available volume-");
        VNode<E>current=head;
        for(int i=0;i<size;i++){
            System.out.println("Volume Level "+current.element+" ");
            current=current.next;
        }
        System.out.println();
    }
    
    public E removeFirst(){
        VNode<E>tmp=head;
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
        VNode<E>tmp=tail;
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
            VNode<E>current=head;
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
        VNode<E>tmp=head;
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
        VNode<E>current=head;
        while(current!=null){
            current=current.next;
            sizeCheck++;
        }
        return sizeCheck;
    }     
     
    //Get the index of element
     public int getIndex(E e){
         int index=-1;
         VNode<E>current=head;
         for(int i=0;i<size;i++){
            if(current.element.equals(e)){
                 index=i;
                 break;
            }
             current=current.next;
        }
        return index;
     }
     
    //To move forward or backward in volume list
    public E nextLevel(char nextV){
        if(currentLevel==null)
            currentLevel=head;
        if(nextV=='+'){
            if(currentLevel!=tail)
                currentLevel=currentLevel.next;
            else 
                System.out.println("Maximum volume is reached");
        }
        else if(nextV=='-'){
            if(currentLevel!=head)
                currentLevel=currentLevel.prev;
            else
                System.out.println("Minimum volume is reached");
        }
        return currentLevel.element;
    }
    
    public void setCurrentlevel(E e){
        VNode<E>current=head;
        for(int i=0;i<getIndex(e);i++){
            current=current.next;
        }
        currentLevel=current;
    }
    
}

