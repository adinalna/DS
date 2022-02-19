/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2_Q4;

/**
 *
 * @author adina
 */
public class MinMax<E extends Comparable>{
    
    public static void main(String[] args) {
        
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
   
    public static <E extends Comparable<E>> String minmax (E[]list){
       E max=list[0],min=list[0];
        //Find max and min
        for(int i=0;i<list.length;i++){
            if(list[i].compareTo(max)>0)
                max=list[i];
            if(list[i].compareTo(min)<0)
                min=list[i];
        }
        return "Min = "+min+" Max = "+max;
    }
}
