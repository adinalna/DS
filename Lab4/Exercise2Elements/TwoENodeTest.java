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
public class TwoENodeTest {
    public static void main(String[] args) {
        
        LinkedList2E<String,Integer> List = new LinkedList2E();
        List.add("Burger", 5);
        List.add("French Fries", 2);
        List.add("Ice Lemon Tea",3);
        List.add("Ice Cream", 2);
        List.print();
    }
}
