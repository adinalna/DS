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
public class FindMax {
    public static void main(String[] args){
        
        Integer[]Numbers={1,2,3};
        String[]Words={"red","green","blue"};
        Circle[]Radius={new Circle(3),new Circle(2.9),new Circle(5.9)};
        
        System.out.println("Maximum is "+max(Numbers));
        System.out.println("Maximum is "+max(Words));
        System.out.println("Maximum is "+max(Radius));
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        E max=list[0];
        for(int i=0;i<list.length;i++){
            if(list[i].compareTo(max)>0)
                max=list[i];
        }
        return max;
    }

}
