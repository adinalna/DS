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
public class Item<E,T> {
    protected E item;
    protected T price;
    
    public Item(E item, T price) {
        this.item = item;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" + "item=" + item + ", price=RM" + price + '}';
    }
    
    
}
