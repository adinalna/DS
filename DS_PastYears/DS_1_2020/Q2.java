/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2020;

/**
 *
 * @author adina
 */
public class Q2 {
    public static void main(String[] args) {
        
        GenericQueue<String>q=new GenericQueue<>(10);
        q.enqueue("Dom T");
        q.enqueue("Rafa N");
        q.enqueueMany("Roger F,Daniil M,Novak D,Alex Z,Stef T,Karen K");
        q.display();
        q.dequeue();
        q.enqueue("Matt B");
        q.enqueue("Kei N");
        q.display();
        q.dequeueAll();
        q.display();
        System.out.println("----------------------------");
        
        GenericQueue<Integer>q2=new GenericQueue<>(10);
        q2.enqueue(10);
        q2.enqueue(20);
        q2.enqueueMany("30,40,50,60,70,80,90");
        q2.display();
        q2.changeOrder(5);
        q2.display();
    }
}
