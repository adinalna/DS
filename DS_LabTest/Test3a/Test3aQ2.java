/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3a;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Test3aQ2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter switch number: ");
        int n=s.nextInt();
        //To display for user input
        System.out.println("There are "+n+" switches is the campus.");
        //To display outputnThere
        System.out.println("The total number of connection required is "+connections(n-1));
    }
    public static int connections(int num){
        if(num==1)
            return 1;//1 connection is needed for 1 switch
        if(num==0)
            return 0;//no connection is needed for 0 switch
        else{
            return num+connections(num-1);//recursion call for num-1
        }
    } 
}
