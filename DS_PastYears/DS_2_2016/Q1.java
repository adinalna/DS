package DS_2_2016;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Day day = new Day();
        System.out.println("Specify your day in number");
        day.displayDays();
        int numDay = s.nextInt();
        day.displayCurrentDay(numDay);
        System.out.println("How many days to add to the specified/current day ("+day.getCurrentDay()
        +")? : ");
        int addedDay = s.nextInt();
        day.dayAddition(addedDay);
    }
}
