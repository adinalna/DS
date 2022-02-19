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
public class MyArray{
    public static void main(String[] args) {
        Integer[]numbers={1,2,3,4,5};
        String[]names={"Jane","Tom","Bob"};
        Character[]alphabets={'a','b','c'};
        
        listall(numbers);
        listall(names);
        listall(alphabets);
    }
    public static <E> void listall(E[]list){
        for( int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
}
