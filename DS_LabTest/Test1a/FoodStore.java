/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1a;

import java.util.LinkedList;

/**
 *
 * @author adina
 */
public class FoodStore extends ShopLot implements Comparable<FoodStore>{
    LinkedList<Item<String,Integer>> menu;

    public FoodStore(LinkedList<Item<String, Integer>> menu, String shopName, Person contactPerson, Person[] Employee) {
        super(shopName, contactPerson, Employee);
        this.menu = menu;
    }
        
    @Override
    public int compareTo(FoodStore o){
        return ((Integer)this.Employee.length).compareTo((Integer)o.Employee.length);
    }
    
    @Override
    public boolean equals(Object o){
        return this.contactPerson.name.equals(((FoodStore)o).contactPerson.name);   
    }

    @Override
    public String toString() {
            
            String menuStr="";
            for(Item<String,Integer> food:menu){
                menuStr+=food+", ";
            }
            menuStr=menuStr.substring(0, menuStr.length()-2);
            String employeeStr="";
            
            for(Person e: Employee){
                employeeStr+=e+", ";
            }
            employeeStr=employeeStr.substring(0, employeeStr.length()-2);
        
        return super.toString()+"menu=[" + menuStr + ']'+"employees=["+employeeStr+"]";
    }
    
    
}
