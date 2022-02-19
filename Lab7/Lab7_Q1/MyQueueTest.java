/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7_Q1;

/**
 *
 * @author adina
 */
public class MyQueueTest {
    public static void main(String[] args) {
        
        //a. Have an initialize queue items consists of Durian and Blueberry in a fruitQ
        String[]fruits ={"Durian", "BlueBerry"};
        MyQueue<String>fruitQ=new MyQueue<>(fruits);
        
        //b. Then add new items in the following order: Apple, Orange, Grapes, Cherry. 
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        
        //c. Display the queue.
        System.out.println(fruitQ.toString());
        
        //d. Show the top item        
        System.out.println("The top item: "+fruitQ.peek());
        
        //e. Get the queue size.
        System.out.println("Size of queue: "+fruitQ.getSize());
        
        //f. Delete Durian.
        fruitQ.dequeue();
        
        //g. Get item in index position of 2
        System.out.println("Item at index 2: "+fruitQ.getElement(2));
        
        //h. Check whether the queue consists of Cherry
        System.out.println("Queue contains Cherry: "+fruitQ.contains("Cherry"));
        
        //h. Check whether the queue consists of Cherry
        System.out.println("Queue contains Durian: "+fruitQ.contains("Durian"));
        
        //j. Display the queue using the isEmpty() condition.
        System.out.print("Queue: ");
        while(!fruitQ.isEmpty()){
            System.out.print(fruitQ.dequeue()+" ");
        }
        System.out.println();
    }
}
