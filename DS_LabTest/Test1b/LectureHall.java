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

public class LectureHall extends Room implements Comparable<LectureHall>{
    ArrayList<OtherItem>list;

    public LectureHall(ArrayList<OtherItem> list, String roomName, int seatsNo, int compNo) {
        super(roomName, seatsNo, compNo);
        this.list = list;
    }
    
    @Override
    public int compareTo(LectureHall o){
        return ((Integer)this.seatsNo).compareTo((Integer)o.seatsNo);
    }

    @Override
    public String toString() {
        
        String otherStr="";
        for(OtherItem item:list){
            otherStr+=item+", ";
        }
        otherStr=otherStr.substring(0, otherStr.length()-2);
        otherStr="["+otherStr+"]";
        
        return "LectureHall" + super.toString()+"otherItems="+otherStr+"}";
    }
    
    
    
}
