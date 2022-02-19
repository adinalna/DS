/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2Elements;

/**
 *
 * @author adina
 */
public class Node<E,T> {
    Node<E,T>next;
    E element1;
    T element2;

    public Node(E element1, T element2) {
        this.element1 = element1;
        this.element2 = element2;
    }
}
