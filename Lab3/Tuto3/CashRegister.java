/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuto3;

/**
 *
 * @author adina
 */
public interface CashRegister {
    
    public double AcceptPayment();
    
    public double ReturnChange();
    
    public double setCashOnHand();
    
    public double getCashOnHand();
}
