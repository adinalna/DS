/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2_Q3;

/**
 *
 * @author adina
 */
public class CompareMax{
    
   public static <E extends Comparable<E>> E maximum(E one, E two, E three){
        E max=one;
        if(two.compareTo(max)>0)
            max=two;
        if(three.compareTo(max)>0)
            max=three;
        return max;
   }
   
    public static void main(String[] args) {
        
        System.out.println("Maximum: "+maximum(10,5,1));
        System.out.println("Maximum: "+maximum(3,9,20));
    }
}
