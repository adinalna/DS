/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2a;

import java.util.ArrayList;

/**
 *
 * @author adina
 */

public class Test2a {
    public static void main(String[] args) {
        
        
        //Expected Output for Part A- An unsorted list of people 
        //who have registered for the vaccine program.
        Stack raw = new Stack("Raw list");
        raw.push("ali",32,"m","doctor");
        raw.push("lisa",29,"f","nurse");
        raw.push("tanaka",41);
        raw.push("ahmad",18,"m","developer");
        raw.push("maria",20,"f","accountant");
        raw.push("chong",70,"m","lawyer");
        raw.push("raju",55,"m","police");
        raw.push("alex",16,"f","business man ");
        Person katie = new Person("katie",36,"f","teacher");
        raw.push(katie);
        raw.displayStack();
       
        //For part B: separate the raw stack to fronliners and others
        System.out.println("~~~~~~~Sort into frontliners and others~~~~~~~");
        //frontliners stack
        Stack frontliners = new Stack("Frontliners");
        //Others stack
        Stack others = new Stack("Others");
        while(!raw.isEmpty()){
            if(raw.peek().frontliner==true)
                frontliners.push(raw.pop());
            else
               others.push(raw.pop());
        }
        
        //display raw, frontliners and others stack
        raw.displayStack();
        System.out.println("----------------");
        frontliners.displayStack();
        System.out.println("----------------");
        others.displayStack();
        System.out.println("----------------");
        
        System.out.println("~~~~~~~Sort into Vaccine list~~~~~~~");
        Stack priority = new Stack("Vaccine Priority List");
        
        vaccineSort(others,priority);
        vaccineSort(frontliners,priority);

        others.displayStack();
        System.out.println("----------------");
        frontliners.displayStack();
        System.out.println("----------------");
        //display to be vacinated stack
        priority.displayStack();
    }
    
    public static Stack<Person> vaccineSort(Stack oldstack,Stack newstack){
        //create a temporary array and pop all the person from fronliner and others stack into it
        ArrayList<Person>tempArray=new ArrayList<>();
        while(!oldstack.isEmpty()){
            tempArray.add(oldstack.pop());
        }
        //bubblesort temporary array
       int sizeothers = tempArray.size();
        for (int i = 0; i < sizeothers-1; i++){
            for (int j = 0; j < sizeothers-i-1; j++){
                if (tempArray.get(j).age > tempArray.get(j+1).age){
                    Person tempothers = tempArray.get(j);
                    tempArray.set(j, tempArray.get(j+1));
                    tempArray.set(j+1, tempothers);
                }
            }   
        }
        
        //push persons from temporary array into priority stack
        for(Person e:tempArray){
            newstack.push(e);
        }
        return newstack;
    }
}
