/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2_Q2;

/**
 *
 * @author adina
 */
public class MyGeneric <E>{
    private E e;

    public MyGeneric() {
    }
    
    public MyGeneric(E e) {
        this.e = e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }
    
    
}
