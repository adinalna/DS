/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2b;

import java.util.ArrayList;

/**
 *
 * @author adina
 */
public class Test2b {
    public static void main(String[] args) {
        
        //Input for Part A. 
        Stack raw = new Stack("Raw list");
        raw.push("lisa",29,"f","nurse","healthy");
        raw.push("jane",47,"f","clerk","thyroid");
        raw.push("raju",55,"m","police","lung,diabetes,heart");
        raw.push("maria",20,"f","accountant","broken arm");
        raw.push("chong",70,"m","lawyer","diabetes");
        raw.push("raju",55,"m","police","lung,diabetes,heart");
        raw.push("jane",47,"f","doctor","healthy");
        raw.push("fred",47,"m","producer","lung,athma,hypertension");
        raw.push("bob",65,"m","pensioner","heart,liver");
        raw.push("jane",47,"f","doctor","healthy");
        raw.push("raju",55,"m","police","lung,diabetes,heart");
        raw.displayStack();
        System.out.println("-------------------");
        removeDuplicates(raw);
        System.out.println("~~~After removing duplicates.......~~");
        raw.displayStack();
    }
    
    public static boolean compare(Person a, Person b){
        if(a.name.equals(b.name)&&(a.age==b.age)&&a.gender.equals(b.gender)&&a.occupation.equals(b.occupation)){
            return true;
        }else
            return false;
    } 
    
    public static void removeDuplicates(Stack stack){
      
        ArrayList<Person>tempArray=stack.toArray();
        Stack tempStack=new Stack();
        int stackIndex=0;
        
        while(!stack.isEmpty()){
            boolean duplicate=false;
            Person temp=stack.pop();
            for(int i=0;i<tempArray.size();i++){
                if(i==stackIndex){
                    continue;
                }
                if(compare(temp,tempArray.get(i))==true){
                    duplicate=true;
                }
            }
            if(duplicate==false){
                tempStack.push(temp);
            }
            stackIndex++;
        }
       
        while(!tempStack.isEmpty())
            stack.push(tempStack.pop());
        
    }
}
