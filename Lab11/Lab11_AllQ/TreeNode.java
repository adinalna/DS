/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11_AllQ;

/**
 *
 * @author adina
 * @param <E>
 */
public class TreeNode<E extends Comparable<E>> {
    E element;
    TreeNode<E>left,right;

    public TreeNode(E element) {
        this.element = element;
    }
    
}
