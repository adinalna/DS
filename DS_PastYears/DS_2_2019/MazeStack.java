/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2019;


/**
 *
 * @author adina
 */
public class MazeStack<E> {
    private int size;
    MazeStackNode<E>head,tail;
    
    //constructor for the generic stack class
    public MazeStack() {

    }

    //isEmpty
    public boolean isEmpty(){
        return head==null;
    }
    
    
    //peek
    public E peek(){
        if(isEmpty()){
            return null;
        }else{
            return tail.element;
        }
    }
    
    //push
    public void push(E e){
        MazeStackNode<E>newNode=new MazeStackNode<>(e);
        if(isEmpty()){
            head =tail= newNode;
            size ++;
        }else{
            tail.next=newNode;
            tail=newNode;
            size ++;
        }
    }
    
    //pop
    public E pop(){
        if(isEmpty())
            return null;
        else if(size==1){
            E removed = tail.element;
            head=tail=null;
            size--;
            return removed;
        }
        else{
            MazeStackNode<E>current=head;
            MazeStackNode<E>prev=head;
            while(current.next!=null){
                prev=current;
                current=current.next;
            }
            prev.next=null;
            tail=prev;
            size--;
            return current.element;
        }
    }
    
    public MazeStack<E> toStack(){
        MazeStack<E>stack=new MazeStack<>();
        MazeStackNode<E>current=head;
        while(current!=null){
            stack.push(current.element);
            current=current.next;
        }
        return stack;
    }
      
    @Override
    public String toString(){
        String output="";
        MazeStackNode<E>current=head;
        while(current!=null){
            output=output+current.element+" > ";
            current=current.next;
        }
        output=output.substring(0, output.length()-2);
        return output;
    }
}
