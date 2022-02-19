/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SList;

/**
 *
 * @author adina
 */
public class TestSList {
    public static void main(String[] args) {
        
        SList<String>List=new SList<>();
        List.add("Linked list");
        List.add("is");
        List.add("easy");
        List.display();
        System.out.println(List.removeElement("Linked list"));
        System.out.println(List.contains("difficult"));
        List.clear();
    }
}
