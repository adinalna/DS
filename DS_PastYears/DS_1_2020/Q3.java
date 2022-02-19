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
public class Q3 {
    public static void main(String[] args) {
        
        LL myLL = new LL();
        
        myLL.createNode("Lord of The Rings", 500);
        myLL.createNode("Tale of the Body Thief", 1);
        myLL.createNode("Memnoch the Devil", 100);
        myLL.createNode("Heart of a Samurai", 10);
        myLL.display();
        myLL.addAfter("Memnoch the Devil", "White Crane", 10);
        myLL.addAfter("White Crane", "Memoirs of a Geisha", 90);
        myLL.removeNode("Harry Poter");
        myLL.removeNode("Heart of a Samurai");
        myLL.display();
    }
}
