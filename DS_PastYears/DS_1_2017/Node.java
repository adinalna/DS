/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2017;

/**
 *
 * @author adina
 */
public class Node<E> {
    public E element;
    Node<E>next;

    //default constructor
    public Node() {
    }
    
    //constructor with one parameter 
    public Node (E element) {
        this.element = element;
    }
    
    //double parameterized constuctor
    public Node (E element, Node<E>next) {
        this.element = element;
        this.next=next;
    }
}
