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
public class Node<E,T> {
    E subject;
    T creditHour;
    Node<E,T>next;
    
    //Constructor for the linked list
    public Node(E subject, T creditHour) {
        this.subject = subject;
        this.creditHour = creditHour;
    }
    
    
}
