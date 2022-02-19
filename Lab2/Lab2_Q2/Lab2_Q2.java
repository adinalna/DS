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
public class Lab2_Q2 {
    public static void main(String[] args) {
        
        MyGeneric<String>strObj=new MyGeneric<>();
        MyGeneric<Integer>intObj=new MyGeneric<>();
        
        strObj.setE("Cat");
        intObj.setE(14);
        
        System.out.println(strObj.getE()+" "+intObj.getE());
    }
}
