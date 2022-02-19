/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuto3;

/**
 *
 * @author adina
 */
public interface Dispenser<E> {
    
    public void release();
    
    public double SetCost();
    
    public double SetNoItem();
    
    public double GetCost();
    
}
