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
public class Q4 {
    public static void main(String[] args) {
       
        /*before modifications
        LList list = new LList();
        list.add("Computing Mathematics", 3);
        list.add("Principles of AI", 3);
        list.add("Programming 1", 5);
        list.add("Data Structure", 5);
        list.display();
        list.addAfter("Programming 1", "Software Architecture", 4);
        list.addAfter("Software Architecture", "Networking", 4);
         
        list.remove("Networking",4) ;
        list.display();
        
        list.remove("Principles of AI", 3);
        list.display();
        */
        
        LList list = new LList();
        
        list.add("Computing Mathematics", 3);
        list.add("Principles of AI", 3);
        list.add("Programming 1", 5);
        list.add("Data Structure", 5);
        
        list.totalCreditHours();
        list.addAfter("Programming 1", "Software Architecture", 4);
        list.addAfter("Software Architecture", "Networking", 4);
        
        list.totalCreditHours();
        list.remove("Networking", 4);
        
        list.remove("Principles of AI", 3);
        
        list.totalCreditHours();
    }
}
