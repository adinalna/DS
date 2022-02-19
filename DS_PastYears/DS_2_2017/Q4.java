/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2017;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        
        Character[]alphabet=new Character[26];
        Queue<Integer>index=new Queue<>();
        for(int i=0;i<26;i++){
            alphabet[i]=(char)('a'+i);
            index.enqueue(i);
        }
        Queue<Character>queue=new Queue<>(alphabet);
        Scanner s = new Scanner(System.in);
        System.out.println("Queue:"+queue.toString());
        System.out.println("Index:"+index.toString());
        System.out.print("\nHow many times will you enter a number: ");
        int num=s.nextInt();
        System.out.println("(Please enter your number(s) between 0-26.)");
        Queue<Integer>number=new Queue<>();
        for(int i=0;i<num;i++){
            System.out.print("Enter number "+(i+1)+" >> ");
            number.enqueue(s.nextInt());
        }
        System.out.println("The entered numbers are"+number.toString()); 
        System.out.print("The deciphered value are ");
        if(number.isEmpty())
            System.out.println("-Cannot decipher. No value is entered.-");
        else{
            int size=number.getSize();
            for(int i=0;i<size;i++){
                System.out.print(queue.getElement(number.dequeue()));
            }
            System.out.println();
        }
    }
}
