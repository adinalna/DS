/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuto2;

/**
 *
 * @author adina
 */
public class Duo <A,B>{
    private A first;
    private B second;

    public Duo(A first, B second) {
        this.first = first;
        this.second = second;
    }
    public static void main(String[] args) {
        
        Duo<String,Integer>sideShape=new Duo<>("2",1);
        Duo<Double,Double>points=new Duo<>(2.0,2.0);
    }
    
    
}
