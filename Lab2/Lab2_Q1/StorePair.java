/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2_Q1;

/**
 *
 * @author adina
 */
public class StorePair<E extends Comparable<E>> implements Comparable<StorePair<E>>{
    private E first,second;

    public StorePair(E first, E second) {
        this.first = first;
        this.second = second;
    }
    
    public E getFirst() {
        return first;
    }
    
    public E getSecond() {
        return second;
    }
    
    public void setPair(E first, E second) {
        this.first = first;
        this.second = second;
    }
   
    @Override
    public int compareTo(StorePair<E> o){
        return this.first.compareTo(o.first);        
    }
    
    @Override
    public boolean equals(Object o){
        StorePair<E> other=(StorePair<E>) o;
        return this.first.equals(other.first);
    }
    
    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }

}
