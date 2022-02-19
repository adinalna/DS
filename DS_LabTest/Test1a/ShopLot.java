/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1a;

/**
 *
 * @author adina
 */
public class ShopLot {
    protected String shopName;
    protected Person contactPerson;
    protected Person[]Employee;

    public ShopLot() {
    }

    public ShopLot(String shopName, Person contactPerson, Person[] Employee) {
        this.shopName = shopName;
        this.contactPerson = contactPerson;
        this.Employee = Employee;
    }

    @Override
    public String toString() {
        return "ShopLot{" + "shopName=" + shopName + contactPerson;
                
    }

    
    
    
}
