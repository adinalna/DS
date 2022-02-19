/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5_Q2;

/**
 *
 * @author adina
 */
public class KNode<E> {
    E element;
    KNode<E>next;

    public KNode() {
    }

    public KNode(E element) {
        this.element = element;
    }
   
}
