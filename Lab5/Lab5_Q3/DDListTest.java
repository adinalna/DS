/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5_Q3;

/**
 *
 * @author adina
 */
public class DDListTest {
    public static void main(String[] args) {
        
        DoublyLinkedList<Integer>NumList=new DoublyLinkedList<>();
        NumList.addFirst(1);
        NumList.add(10);
        NumList.addLast(100);
        NumList.addMiddle(2, 2);
        NumList.remove(3);
        System.out.println();
        NumList.iterateForward();
        NumList.iterateBackward();
        System.out.println("size of current Doubly Linked List: "+NumList.getSize());
        NumList.clear();
        System.out.println("\nsize of current Doubly Linked List: "+NumList.getSize());
        
    }
}
