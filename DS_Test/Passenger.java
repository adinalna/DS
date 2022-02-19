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
public class Passenger implements Comparable<Passenger> {
    String name;
    private final String locationDistance;
    Double distance;

    public Passenger(String name, String locationDistance){
        this.name = name;
        this.locationDistance = locationDistance;
        String[] arr = locationDistance.split(" ");
        distance = Double.parseDouble(arr[1]);
    }

    public Double getDistance(){
        return distance;
    }

  
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Passenger o) {
        return this.distance.compareTo(o.distance);
    }
    
}
