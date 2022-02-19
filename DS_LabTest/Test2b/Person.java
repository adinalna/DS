/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2b;

/**
 *
 * @author adina
 */
public class Person {
    String name,gender,occupation,risk_category,illness;
    int age,age_category,illness_level,risk_level;
    String[]illness_list={"heart","diabetes","lung","athma","hypertension"};

    public Person(String name, int age, String gender, String occupation, String illness) {
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
        this.illness = illness;
        this.age = age;
    }
    
    
    
    
    public String RiskCategory(){
        
        //get the age category
        if(age<=17)
            age_category=2;
        else if(age>=18&&age<45)
            age_category=3;
        else if(age>=45&&age<65)
            age_category=4;
        else if(age>=65&&age<75)
            age_category=5;
        else if(age>=75)
            age_category=6;
        
        //get the illness level
        String[]personIll=illness.split(",");
        for(String list:illness_list){
            for(String person:personIll){
                if(list.equals(person))
                    illness_level+=2;
            }
        }
        
        //calculate the rick level
        risk_level=illness_level+age_category;
        
        //get the risk category
        if(risk_level<4)
            risk_category="Low Risk";
        else if(risk_level>=4&&risk_level<7)
            risk_category="Moderate Risk";
        else if(risk_level>=4)
            risk_category="High Risk";
        
        return risk_category;
    }

    @Override
    public String toString() {
        return name+","+age+","+gender+","+occupation+" "+RiskCategory();
    }
    
    
}
