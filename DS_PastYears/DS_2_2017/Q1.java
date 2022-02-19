/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2017;

/**
 *
 * @author adina
 */
public class Q1 {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.insertFirstLink("Louis Vuitton", 10);
        list.insertFirstLink("Chanel", 100);
        list.insertFirstLink("Prada", 1);
        list.insertFirstLink("Tods", 500);
        list.display();
        list.addAfter("Chanel", "Coach", 10);
        list.display();
        list.addAfter("Coach", "Mulberry", 90);
        list.display();
        list.removeLink("Chanel");
        list.display();
        list.removeLink("Coach");
        list.display();
    }
}
