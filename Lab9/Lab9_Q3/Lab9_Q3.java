/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9_Q3;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Lab9_Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("x: ");
        int x=s.nextInt();
        System.out.print("y: ");
        int y=s.nextInt();
        System.out.println("Result: "+exponent(x,y));

    }
    //assuming, y >= 0
    public static int exponent(int x,int y){
        if(y==1){
            return x;   
        }else
            return x*exponent(x,y-1);
    }
}
