/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2a;

/**
 *
 * @author adina
 */
public class Person {
    String name,occupation,gender;
    int age;
    String[]occupation_list={"doctor","nurse","teacher","police"};
    boolean frontliner=false;
    
    //constructor without occupation
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //constructor with occupation
    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
        this.age = age;
        setFrontliner(occupation);
    }
    
    public void setFrontliner(String front){
        for(String liner:occupation_list)
            if(liner.equals(front))
                frontliner=true;
    }

    //tostring for person class
    @Override
    public String toString() {
        if(frontliner==true) 
            return name+" "+age+" "+gender+" Frontliner";
        else
            return name+" "+age+" "+gender+" Not frontliner";
    }
    
    
}
