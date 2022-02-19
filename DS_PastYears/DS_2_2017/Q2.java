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
public class Q2 {
    public static void main(String[] args) {
        
        GenericStack<String>stack=new GenericStack<>();
        System.out.println("isEmpty() returns "+stack.isEmpty());
        
        System.out.println("\nPush 3 books to the pile:");
        Scanner s = new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.print("Enter book title "+(i)+": ");
            String book=s.nextLine();
            stack.push(book);
        }
        System.out.println("\nThe new books that you added are: "+stack.toString());
        System.out.println("\nThe pile should not be empty:");
        System.out.println("isEmpty() returns "+stack.isEmpty());
        System.out.println("The pile has "+stack.size()+" books.");
        System.out.println("\nGet the top book and remove the top book:\n");
        for(int i=1;i<=3;i++){
            System.out.println(stack.peek()+" is at top of the pile.");
            System.out.println(stack.pop()+" is removed from the pile.\n");
        }
        System.out.println("The pile should be empty:");
        System.out.println("isEmpty() returns "+stack.isEmpty());
    }
}
