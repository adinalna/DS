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
import java.text.SimpleDateFormat;
import java.util.Date;
public class Transaction {
    private Date date;
    private char type;
    private double amount, balance;
    private String description;
    String strDate;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    
    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount=amount;
        this.balance = balance;
        this.description = description;
        date=new Date();
        strDate=formatter.format(new Date());
    }

    public String toString() {
        return strDate+ " " +description+"\n";
    }

    
    
    
}
