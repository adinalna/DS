/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2020;

/**
 *
 * @author adina
 */
public class Node<E,T> {
    E movie;
    T sold;
    Node<E,T>next;
    
    //default constructor for node class
    public Node() {
    }
    
    //constuctor with parameter
    public Node(E movie, T price) {
        this.movie = movie;
        this.sold = price;
    }
    
    
}
