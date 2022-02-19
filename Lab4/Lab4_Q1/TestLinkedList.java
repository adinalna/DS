/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4_Q1;

/**
 *
 * @author adina
 */
import java.util.Random;
public class TestLinkedList {
    public static void main(String[] args) {
        
        MyLinkedList<Character>List=new MyLinkedList<>();
        List.add('a');
        List.add('b');
        List.add('c');
        List.add('d');
        List.add('e');
        List.print();
        List.reverse();
        System.out.println("Number of elements "+List.getSize());
        System.out.println("First value: "+List.getFirst());
        System.out.println("Last value: "+List.getLast());
        int middle = List.getSize()/2;
        System.out.println("Removed middle element at index "+middle+": "+List.remove(middle));
        System.out.println("The index of b: "+List.indexOf('b'));
        System.out.println("The index of c: "+List.indexOf('c'));
        System.out.println("The list contains c: "+List.contains('c'));
        System.out.println(List.set(0,'h'));
        System.out.println(List.set(1,'e'));
        System.out.println(List.set(2,'l'));
        System.out.println(List.set(3,'l'));
        List.add(4,'o');
        System.out.println("size check: "+List.getSize());
        System.out.println("size: "+List.mainsize());
        System.out.println("size check: "+List.getSize());
        System.out.println("First value: "+List.getFirst());
        System.out.println("Last value: "+List.getLast());
        List.print();
        
        //No.2
        System.out.println("\nMiddle value: "+List.getMiddleValue());
        
        //for lab exercise
        MyLinkedList newList=Randomize(List);
        newList.print();
        
    }
    
    public static <E> MyLinkedList<E> Randomize(MyLinkedList<E>original){
        Random r = new Random();
        MyLinkedList<E> newList = new MyLinkedList<>();
        for(int i=0;i<original.getSize();i++){
            newList.add(original.get(i));
        }
        for(int i=0;i<newList.getSize();i++){
            int newIndex =r.nextInt(newList.getSize());
            E change = newList.get(newIndex);
            E initial = newList.get(i);
            newList.set(i,change);
            newList.set(newIndex, initial);
        }
        return newList;
    }
}
