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
public class RNode<E> {
    E element;
    RNode<E>next;
    RNode<E>prev;

    public RNode() {
    }
    
    public RNode(E element, RNode<E> next, RNode<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
