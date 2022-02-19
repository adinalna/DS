/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7_Q3;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Lab7_Q3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Queue<Integer> share = new Queue<>();
        Queue<Integer> price = new Queue<>();
        String input;
        String []str;
        int capital=0;
        
        do{
            System.out.print("Enter your query (In format 'Buy/Sell x shares at $y each'): ");
            input=s.nextLine();
            str=input.split(" ");
            String expenseStr;
            int expenseInt,toBuy;
            //To Buy
            if(str[0].equals("Buy")){
                System.out.println("-Buying-");
                share.enqueue(Integer.parseInt(str[1]));
                expenseStr=str[4].substring(1);
                price.enqueue(Integer.parseInt(expenseStr));
            //To Sell
            }else if(str[0].equals("Sell")){
                System.out.println("-Selling-");
                toBuy = Integer.parseInt(str[1]);
                expenseStr=str[4].substring(1);
                expenseInt=Integer.parseInt(expenseStr);
                
                    if(toBuy>=share.peek()){
                        do{
                            if(toBuy>=share.peek()){
                                capital+=(share.peek()*(expenseInt-price.dequeue()));
                                toBuy-=share.dequeue();
                                if(share.isEmpty()){
                                    break;
                                }
                            }else{
                                int remainder=share.peek()-toBuy;
                                capital+=(toBuy*(expenseInt-price.peek()));
                                toBuy=0;
                                share.dequeue();
                                share.enqueue(remainder);
                            }
                        }while(toBuy>0);
                   
                    }else{
                        int remainder=share.peek()-toBuy;
                        capital+=(toBuy*(expenseInt-price.peek()));
                        share.dequeue();
                        share.enqueue(remainder);    
                    }
                
                System.out.println("Total Capital Gain/Loss: "+capital);
            }else{
                System.out.println("Wrong input format. Please enter again.");
            }
            //print the queue for share and price
            if(share.isEmpty()){
                //Print he share and price queue is empty
                System.out.println("No shares to sell!");
            }
            System.out.println("Queue for Share: "+share.toString());
            System.out.println("Queue for Price: "+price.toString());
        }while(!share.isEmpty());

        //Print final capital gain/loss
        System.out.println("Final Capital Gain/Loss: "+capital);
    }
}
