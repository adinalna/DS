/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2019;


/**
 *
 * @author adina
 */
public class MazeStackNode<E> {
    E element;
    MazeStackNode<E> next;

    public MazeStackNode(E element) {
        this.element = element;
    }
}
