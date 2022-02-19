/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_Test;

/**
 *
 * @author adina
 */
public class Stop {
    char stopName;
    String distance;

    public Stop(char stopName, String distance) {
        this.stopName = stopName;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Stop "+stopName;
    }
   
}
