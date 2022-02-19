/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SList;

/**
 *
 * @author adina
 */
public class SNode<E> {
E element;
SNode<E>next;

    public SNode() {
    }
    
    public SNode(E element){
        this.element = element;
    }
    public SNode(E element, SNode<E> next) {
        this.element = element;
        this.next = next;
    }
    
    
}
