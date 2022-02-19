/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2018;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Q1 {
    public static int N;
    public static Stack<Integer> [] Tower =new Stack[3];
    public static void main(String[] args) {
             
        Tower[0] = new Stack<>();
        Tower[1] = new Stack<>();
        Tower[2] = new Stack<>();
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
         int num = s.nextInt();
         N = num;
         toh(num);
        
    }
    
     public static void toh(int n){
         for (int d = n; d > 0; d--)
             Tower[0].push(d);
         display();
         move(n, 0, 1, 2);         
     }
     /* Recursive Function to move disks */
     public static void move(int n, int a, int b, int c){
         if (n > 0){
             move(n-1, a, c, b);     
             int d = Tower[a].pop();                                             
             Tower[c].push(d);
             display();                   
             move(n-1, b, a, c);     
         }         
     }
     /*  Function to display */
     public static void display(){
        System.out.println("A: "+Tower[0].toString());   
        System.out.println("B: "+Tower[1].toString());  
        System.out.println("C: "+Tower[2].toString()); 
        System.out.println();
     }
}
