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
public class QueueNode<E> {
    E element;
    QueueNode<E> next;

    public QueueNode(E element) {
        this.element = element;
    }
}
