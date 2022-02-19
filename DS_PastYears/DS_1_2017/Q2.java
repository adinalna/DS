/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2017;

/**
 *
 * @author adina
 */
public class Q2 {
    public static void main(String[] args) {
        
        Queue<Integer>queue=new Queue<>();
        for(int i=1;i<10;i++){
            queue.enqueue(i*10);
        }
        queue.ChangeOrder(4);
        System.out.println(queue.toString());
    }
}
