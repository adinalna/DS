/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2019;

/**
 *
 * @author adina
 */
public class StackNode<E> {
    E element;
    StackNode<E> next;

    public StackNode(E element) {
        this.element = element;
    }
}
