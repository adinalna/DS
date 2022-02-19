/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Q3n4;

/**
 *
 * @author adina
 */

public class Lab1_Q4 {
    public static void main(String[] args) {
        
     
        Account1 accGeorge = new Account1("George",1122,1000);
        accGeorge.setAnnualInterestRate(1.5);
        accGeorge.deposit(30);
        accGeorge.deposit(40);
        accGeorge.deposit(50);
        accGeorge.withdraw(5);
        accGeorge.withdraw(4);
        accGeorge.withdraw(2);
        System.out.println(accGeorge.toString());
    }
}
