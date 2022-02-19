/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2017;

import java.util.ArrayList;

/**
 *
 * @author adina
 */
public class Queue<E> {
    ArrayList<E>list;

    public Queue() {
        list=new ArrayList<>();
    }
    
    public Queue(E[]items) {
        list=new ArrayList<>();
        for(E e:items)
            list.add(e);
    }
    
    public void enqueue(E e){
        list.add(e);
    }
    
    public E dequeue(){
        E removed=list.get(0);
        list.remove(0);
        return removed;
    }
    
    public E getElement(int i){
        return list.get(i);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}
