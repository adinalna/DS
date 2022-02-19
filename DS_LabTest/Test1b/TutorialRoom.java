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
public class TutorialRoom extends Room implements Comparable<TutorialRoom>{
     ArrayList<OtherItem>list;

    public TutorialRoom(ArrayList<OtherItem> list, String roomName, int seatsNo, int compNo) {
        super(roomName, seatsNo, compNo);
        this.list = list;
    }
     
    @Override
    public int compareTo(TutorialRoom o){
        return ((Integer)this.list.size()).compareTo((Integer)o.list.size());
    }

     @Override
    public String toString() {
        
        String otherStr="";
        for(OtherItem item:list){
            otherStr+=item+", ";
        }
        otherStr=otherStr.substring(0, otherStr.length()-2);
        otherStr="["+otherStr+"]";
        
        return "TutorialRoom" + super.toString()+"otherItems="+otherStr+"}";
    }    
}
