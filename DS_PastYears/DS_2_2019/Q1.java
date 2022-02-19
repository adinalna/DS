/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2019;

/**
 *
 * @author adina
 */
public class Q1 {
    public static void main(String[] args) {
        
    MyLinkedList<Integer>list1 = new MyLinkedList<>();
    list1.add(2);
    list1.add(10);
    list1.add(38);
    list1.add(41);
    list1.add(51);
    System.out.println(list1.toString());
    
    MyLinkedList<Integer>list2 = new MyLinkedList<>();
    list2.add(5);
    list2.add(12);
    list2.add(18);
    list2.add(21);
    list2.add(35);
    list2.add(41);
    list2.add(56);
    System.out.println(list2.toString());
        
    MyLinkedList<Integer>newList = combine(list1,list2);
    System.out.println("The newList is:\n"+newList.toString());
    }
    public static <E extends Comparable<E>> MyLinkedList<E>combine(MyLinkedList<E>list1, MyLinkedList<E>list2){
        MyLinkedList<E> newList=new MyLinkedList<>();
        for(int i=0;i<list1.getSize();i++){
            newList.add(list1.get(i));
        }
        for(int i=0;i<list2.getSize();i++){
            newList.add(list2.get(i));
        }
        
        //insertion sort
        for(int i=1;i<newList.getSize();i++){
            E currentElement = newList.get(i);
            int k;
            for(k=i-1;k>=0&&newList.get(k).compareTo(currentElement)>0;k--){
                newList.set(k+1,newList.get(k));
            }
            newList.set(k+1, currentElement);
        }  
        return newList;
    }
}
