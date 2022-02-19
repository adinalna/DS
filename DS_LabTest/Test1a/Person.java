/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1a;

/**
 *
 * @author adina
 */
public class Person {
    String name;
    String EmployeeNo;


    public Person(String name, String EmployeeNo) {
        this.name = name;
        this.EmployeeNo = EmployeeNo;
    }

    public String toString() {
        return "Person{name="+name+", contactNo="+EmployeeNo+"}";
    }
}
