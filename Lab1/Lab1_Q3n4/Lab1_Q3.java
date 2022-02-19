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
public class Lab1_Q3 {
    public static void main(String[] args) {
        
        Account acc1 = new Account(1122,20000);
        acc1.setAnnualInterestRate(4.5);
        acc1.withdraw(2500);
        acc1.deposit(3000);
        System.out.println(acc1.toString());
    }
}
