/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_Q3;




/**
 *
 * @author adina
 */
public class Lab6_Q3 {
    public static void main(String[] args) {
        
        

        Stack<Integer>S = new Stack<>();
        S.push(100);
        S.push(2);
        S.push(34);
        S.push(12);
        S.push(67);
        S.push(14);
        Integer sum;
        while(S.getSize()>1){
           sum = (int)S.pop()+(int)S.pop();
           S.push(sum);
           
        }
        System.out.println("The total sum is: "+S.peek());
        
    }
    
}
