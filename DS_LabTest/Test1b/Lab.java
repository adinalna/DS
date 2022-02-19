/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1b;

import java.util.ArrayList;

/**
 *
 * @author adina
 */
public class Lab extends Room implements Comparable<Lab>{
    ArrayList<OtherItem>list;

    public Lab(ArrayList<OtherItem> list, String roomName, int seatsNo, int compNo) {
        super(roomName, seatsNo, compNo);
        this.list = list;
    }
    
    @Override
    public int compareTo(Lab o){
        return ((Integer)this.compNo).compareTo((Integer)o.compNo);
    }

   public String toString() {
        
        String otherStr="";
        for(OtherItem item:list){
            otherStr+=item+", ";
        }
        otherStr=otherStr.substring(0, otherStr.length()-2);
        otherStr="["+otherStr+"]";
        
        return "Lab" + super.toString()+"otherItems="+otherStr+"}";
    }
    
    
}
