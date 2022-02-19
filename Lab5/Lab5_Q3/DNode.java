/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5_Q3;

/**
 *
 * @author adina
 */
public class DNode<E> {
    E element;
    DNode<E> next;
    DNode<E> prev;

    public DNode(E element, DNode<E> next, DNode<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public DNode() {
    }
}
