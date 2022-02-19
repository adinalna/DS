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
import java.util.Date;
public class Account {
    protected int id;
    protected double balance,annualInterestRate;
    private Date dateCreated;

    public Account() {
        id=0;
        balance=0;
        annualInterestRate=0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate=0;
        dateCreated=new Date();
    }

    //accessor
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    //mutator
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    
    public double getMonthlyInterest(){
        return annualInterestRate/1200*balance;
    }
    
    public double withdraw(double withdraw){
        balance-=withdraw;
        return balance;
    }
    
    public double deposit(double deposit){
        balance+=deposit;
        return balance;
    }

    public String toString() {
        return "Balance: " + balance 
                + "\nMonthly Interest:  " + getMonthlyInterestRate()
                + "\nDate Created: " + dateCreated;
    }
    
    
}
