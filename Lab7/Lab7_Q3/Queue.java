/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7_Q3;

import java.util.LinkedList;

/**
 *
 * @author adina
 */
public class Queue<E> {
    LinkedList<E>list = new LinkedList<>();

    //a. public MyQueue(E[] e)   
    public Queue(E[]e) {
        for(E fruit:e){
            list.add(fruit);
        }
    }
    
    //b. public MyQueue()
    public Queue() {
    }
    
    //c. public void enqueue(E e)
    public void enqueue(E e){
        list.addLast(e);
    }
    
    //d. public E dequeue()
    public E dequeue(){
        return list.removeFirst();
    }
    
    //e. public E getElement(int i)
    public E getElement(int i){
        return list.get(i);
    }
    
    //f. public E peek()
    public E peek(){
        return list.getFirst();
    }
    
    //g. public int getSize()
    public int getSize(){
        return list.size();
    }
    
    //h. public boolean contains(E e)
    public boolean contains(E e){
        return list.contains(e);
    }
    
    //i. public boolean isEmpty();
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    //j. public String tostring()
    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }
    




}
