/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//MinMaxTwoDArray.<Integer>max(numbers)
package Lab2_Q6;

/**
 *
 * @author adina
 */
public class MinMaxTwoDArray {
    
    public static <E extends Comparable<E>> E min(E[][] list){
        E min=list[0][0];
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list[0].length;j++){
                if(list[i][j].compareTo(min)<0)
                    min=list[i][j];
            }
        }
        return min;
    }
    
     public static <E extends Comparable<E>> E max(E[][] list){
        E max=list[0][0];
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list[0].length;j++){
                if(list[i][j].compareTo(max)>0)
                    max=list[i][j];
            }
        }
        return max;
    }

}
