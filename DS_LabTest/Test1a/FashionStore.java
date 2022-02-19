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
public class FashionStore extends ShopLot implements Comparable<FashionStore>{
    LinkedList<Item<String,Integer>>clothes;

    public FashionStore(LinkedList<Item<String, Integer>> clothes, String shopName, Person contactPerson, Person[] Employee) {
        super(shopName, contactPerson, Employee);
        this.clothes = clothes;
    }
    
    @Override
    public int compareTo(FashionStore o){
        return ((Integer)this.Employee.length).compareTo((Integer)o.Employee.length);
    }
    
    @Override
    public boolean equals(Object o){
        return this.contactPerson.name.equals(((FoodStore)o).contactPerson.name);   
    }
    
    @Override
    public String toString() {
        
        String employeeStr="";
        for(Person em:Employee){
            employeeStr+=em+", ";
        }
        employeeStr=employeeStr.substring(0, employeeStr.length()-2);
        
        String clothesStr="";
        for(Item<String,Integer> clh:clothes){
            clothesStr=clh+", "+clothesStr;
        }
        clothesStr=clothesStr.substring(0, clothesStr.length()-2);
        
        return super.toString()+"Item=[" + clothesStr + ']'+"employees=["+employeeStr+"]";
    }
    
    
    
}

