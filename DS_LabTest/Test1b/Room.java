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
public class Room {
    String roomName;
    int seatsNo, compNo;

    public Room() {
    }
    
    public Room(String roomName, int seatsNo, int compNo) {
        this.roomName = roomName;
        this.seatsNo = seatsNo;
        this.compNo = compNo;
    }

    @Override
    public String toString() {
        return "{" + "roomName=" + roomName + ", noOfSeats=" + seatsNo + ", noOfComputer=" + compNo + ",\n";
    }
    
    
}
