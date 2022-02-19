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
public class VNode<E> {
    E element;
    VNode<E>next;
    VNode<E>prev;

    public VNode() {
    }
   
    public VNode(E element, VNode<E> next, VNode<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
