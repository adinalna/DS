/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_Test;

import java.util.PriorityQueue;

/**
 *
 * @author adina
 */
public class Q4 {
    public static void main(String[] args) {
        
        PriorityQueue<Passenger> queue= new PriorityQueue<>();
        queue.offer(new Passenger("Susan","Road 0.9"));
        queue.offer(new Passenger("Jack","Road 5.5"));
        queue.offer(new Passenger("Benjamin","Road 1.6"));
        queue.offer(new Passenger("Rachel","Road 3.8"));
        queue.offer(new Passenger("Samuel","Road 4.1"));
        queue.offer(new Passenger("Kenneth","Road 2.6"));
              
        System.out.println("Passenger Drop-off List");
        char stop='A';
        double currentDistance=0.2,distanceBetween1,distanceBetween2;
        while(queue.size()>0){
            if(queue.peek().getStopDistance()>currentDistance){
                distanceBetween1=queue.peek().getStopDistance()-currentDistance;
                distanceBetween2=queue.peek().getStopDistance()-(currentDistance+1);
            }else{
                distanceBetween1=currentDistance-queue.peek().getStopDistance();
                distanceBetween2=(currentDistance+1)-queue.peek().getStopDistance();
            }
            if(distanceBetween1<distanceBetween2){
                queue.peek().setStopName(stop);
            }else{
                queue.peek().setStopName((char) (stop+1));
            }
            System.out.println(queue.poll());
        }
        
    }
    //if(e.getStopDistance()<currentDistance+1){
               // e.setStopName((char) (e.getStopName()+ 1));
         //   }
}
