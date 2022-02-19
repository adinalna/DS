/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2_Q5;

/**
 *
 * @author adina
 */
public class Circle implements Comparable<Circle>{
    private Double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public int compareTo(Circle o){
        return radius.compareTo(o.radius);
    }

    @Override
    public String toString() {
        return "circle with radius " + radius;
    }
    
    
}
