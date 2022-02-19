/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Q1;

/**
 *
 * @author adina
 */
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Lab1_Q1 {
    public static void main(String[] args) {
        
       //PART 1
       //Write directly in text file and read to print in console
        
        try {
           Scanner part1in = new Scanner(new FileInputStream("AdinaLiyana_S2032469.txt"));
           while (part1in.hasNextLine()){
               System.out.println(part1in.nextLine());
           }
           part1in.close();
        } catch (FileNotFoundException e) {
        System.out.println("File was not found"); 
}    
        
        //PART 2
        
        try {
            PrintWriter part2out = new PrintWriter(new FileOutputStream("AdinaLiyana_S2032469.txt",true));
            Scanner input=new Scanner(System.in);
            String day,date,contents,lines;
            Boolean stop=false;
            System.out.println("- Letter Part 2 -");
            System.out.print("Enter Day: ");
            day=input.next();
            System.out.print("Enter Date (dd MM yyyy): ");
            input.nextLine();
            date=input.nextLine();
        
            part2out.println("\n\n"+day+", "+date+".\n");
            System.out.print("Enter the contents of letter (line by line): ");
            contents=input.nextLine();
            part2out.println(contents);
            while(stop==false){
                System.out.print("Write next line? press Enter to continue or type \"no\" to stop ");
                lines=input.nextLine();
                if(lines.equalsIgnoreCase("no")){
                    stop=true;
                }
                else{
                    System.out.print("Next line: ");
                    contents=input.nextLine();
                    part2out.println(contents);
                }
            }
        part2out.close();
        } catch (IOException e) {
        System.out.println("Problem with file output"); 
}
        
    }    
}
