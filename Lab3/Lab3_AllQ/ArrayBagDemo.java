/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_AllQ;

/**
 *
 * @author adina
 */
public class ArrayBagDemo {
    
    public static void main(String[] args) {
        
    BagInterface<String> Bag1 = new ArrayBag<>();
    BagInterface<String> Bag2 = new ArrayBag<>();
    
    String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
    String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
    
    System.out.println("bag1:");
    testAdd(Bag1,contentsOfBag1);
    displayBag(Bag1);
    System.out.println("bag1:");
    testAdd(Bag2,contentsOfBag2);
    displayBag(Bag2);
    System.out.println("bag3, test the method union of bag1 and bag2:");
    BagInterface<String> Bag3 = Bag1.union(Bag2);
    displayBag(Bag3);
    System.out.println("bag4, test the method intersection of bag1 and bag2");
    BagInterface<String> Bag4 = Bag1.intersection(Bag2);
    displayBag(Bag4);
    System.out.println("bag5, test the method difference of bag1 and bag2:");
    BagInterface Bag5 = Bag1.difference(Bag2);
    displayBag(Bag5);
    }

    private static void testAdd(BagInterface<String> aBag, String[] content){
        //for loop to add all string contents in bag
        System.out.print("Adding");
        for (String content1 : content) {
            aBag.add(content1);
            System.out.print(" "+content1);
        }
        System.out.println();
    }
    
    private static void displayBag(BagInterface<String> aBag){
        System.out.println("The bag contains "+aBag.getCurrentSize()+" string(s), as follows:");
        for(int i=0;i<aBag.getCurrentSize();i++){
            System.out.print(aBag.get(i)+" ");
        }
        System.out.println("\n");
    }
}
