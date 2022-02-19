/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial_1;

/**
 *
 * @author adina
 */
public class C {
    
    public static void main(String[] args) {
        Object[] o = {new A(), new B()};
        System.out.print(o[0]);
        System.out.print(o[1]); 
        }
 }

 class A extends B {
     
    public String toString() {
        return "A";
    }
 }

    class B {
        
        public String toString() {
        return "B";
        } 
    }  

