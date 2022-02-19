/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial_1;

/**
 *
 * @author adina
 */
public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public abstract void accelerate();

    //accessor
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
    
    public void pedalToTheMetal(){
        if(currentSpeed!=maxSpeed)
            accelerate();       
    }
}
