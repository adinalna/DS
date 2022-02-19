/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1b;

/**
 *
 * @author adina
 */
public class OtherItem{
    String name, description;
    int itemNo;

    public OtherItem(String name, String description, int itemNo) {
        this.name = name;
        this.description = description;
        this.itemNo = itemNo;
    }
    
    @Override
    public boolean equals(Object o){
        return this.name.equals(((OtherItem)o).name);
    }

    @Override
    public String toString() {
        return "OtherItem{" + "name=" + name + ", description=" + description + ", totalNumber=" + itemNo + '}';
    }
}
