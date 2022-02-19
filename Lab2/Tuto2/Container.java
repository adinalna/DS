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
public class Container<T> {
    private T t;

    public Container() {
    }
    
    public void add(T t){
        this.t=t;
    }
    
    public T retrieve(){
        return t;
    }
    
    public static void main(String[] args) {
        
        Container<Integer>container1=new Container<>();
        Container<String>container2=new Container<>();
        
        container1.add(50);
        container2.add("Java");
        
        System.out.println("Container 1: "+container1.retrieve());
        System.out.println("Container 2: "+container2.retrieve());
    }
}
