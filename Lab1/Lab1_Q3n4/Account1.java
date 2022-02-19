/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Q3n4;

import java.util.ArrayList;

/**
 *
 * @author adina
 */
public class Account1 extends Account{
    protected String name;
    private ArrayList<Transaction>transactions;

    public Account1(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
        transactions=new ArrayList<>();
    }

    public double withdraw(double withdraw){
        String description = "Withdraw $"+withdraw+" from account";
        balance-=withdraw;
        Transaction WTransac =new Transaction('W',withdraw,balance,description);
        transactions.add(WTransac);
        return balance;
    }
    
    public double deposit(double deposit){
        String description = "Deposit $"+deposit+" into account";
        balance+=deposit;
        Transaction DTransac =new Transaction('D',deposit,balance,description);
        transactions.add(DTransac);
        return balance;
    }
    
    public String toString() {
        return "Name: " + name
                +"\nID: "+id
                +"\nBalance: $"+balance
                +"\nMonthly interest rate: "+getMonthlyInterestRate()+"%"
                +"\nMonthly interest: $"+getMonthlyInterest()
                +"\nTransaction history: \n"+transactions.toString();
             
    }
}
