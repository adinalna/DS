/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2016;



/**
 *
 * @author adina
 */
public class Day {
    private String[]day={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    private int currentNumber;
    
    public Day() {
    }
    
    public void displayDays(){
        for(int i=0;i<7;i++)
            System.out.println((i+1)+" for "+day[i]);
    }
    
    public String getCurrentDay(){
        return day[currentNumber];
    }
    
    public void displayCurrentDay(int num){
        currentNumber=calculateDay(num-1);
        System.out.println("The name of the day is : "+day[currentNumber]);
        System.out.println("The following day of "+day[currentNumber]+" is : "+day[calculateDay(currentNumber+1)]);
        System.out.println("The previous day of "+day[currentNumber]+"is : "+day[calculateDay(currentNumber-1)]);
    }
    
    public int calculateDay(int num){
        if(num>=0){
            while(num>6) 
                num-=7;
        }else{
            num=6;
        }
        return num;   
    }
    
    public void dayAddition(int addedNum){
        currentNumber+=addedNum;
        System.out.println("The new day after the addition of "+addedNum+" day(s) is : "+day[calculateDay(currentNumber)]);
    }
}
