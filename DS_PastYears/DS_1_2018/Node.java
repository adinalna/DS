/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2018;

/**
 *
 * @author adina
 */
public class Node<E,T> {
    E subject;
    T credit;
    Node<E,T>next;
    
    //defaulr constructor
    public Node() {
    }
    
    //constructor woth elemnt parameter
    public Node(E subject,T credit) {
        this.subject = subject;
        this.credit = credit;
    }
    
    
}
