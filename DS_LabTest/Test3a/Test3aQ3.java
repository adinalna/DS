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
import java.util.InputMismatchException;
import java.util.Scanner;
public class Test3aQ3 {
    static Scanner s = new Scanner(System.in);// static sacnner method for inputs
    public static void main(String[] args) {
        int[] array = new int[5];//initilise an array with size five
        int i = 0;//this variable will be used as a count for array index
        intArray(array, 0);//method call
    }
    
    public static void  intArray(int[]array, int i){
        System.out.print("Enter an integer: ");//to display for user input
        int num = 0;//intialise num
        try{
            num=intMissmatch();
            array[i] = num;
            intArray(array, i+1);//recursively add array values
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array of Integer is: ");//to display the final array
            for(int n=0;n<array.length;n++)
                System.out.print(array[n]+" ");
        }
    }
    
    //this metod checks everytime input to detect any input missmatch
    public static int intMissmatch(){
        while(true){
            try{
                return s.nextInt();
            }catch (InputMismatchException e){//to catch any input missmtach
                s.next();
                System.out.println("Invalid input type");//displat to user the ouput is invalid
            }
        }
    }
}
