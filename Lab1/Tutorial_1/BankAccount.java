/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial_1;

/**
 *
 * @author adina
 */
public class BankAccount implements Account {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    
    public int deposit(int addDeposit){
        return balance+addDeposit;
    }
    
    public boolean withdraw(int withdrawMoney){
        if(withdrawMoney<=balance){
            balance-=withdrawMoney;
            return true;
        }
        else 
            return false;
    }
    
}
