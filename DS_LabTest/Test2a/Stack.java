/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2a;


import java.util.ArrayList;

/**
 *
 * @author adina
 */
public class Stack<E> {
    String stack_name;
    ArrayList<Person>MyStack=new ArrayList<>();

    public Stack(String stack_name) {
        this.stack_name = stack_name;
    }
    
    //to push a person object into stack
    public void push(Person e){
        MyStack.add(e);
    }
    
    //to push and create new person with name and age only into stack
    public void push(String name, int age){
        Person newPerson = new Person(name,age);
        MyStack.add(newPerson);
    }
    
    //to push and create new person with name,age,gender and occupation into stack
    public void push(String name, int age, String gender, String occupation){
        Person newPerson = new Person(name,age,gender,occupation);
        MyStack.add(newPerson);
    }
    
    //to pop a person
    public Person pop(){
        Person temp=MyStack.get(getSize()-1);
        MyStack.remove(getSize()-1);
        return temp;
    }
    
    
    //get the last in stack
    public Person peek(){
        return MyStack.get(getSize()-1);
    }
    
   //get stack size
    public int getSize(){
        return MyStack.size();
    }
    
    //cheack if stack in empty
    public boolean isEmpty(){
        return MyStack.isEmpty();
    }
    
    //tostring method
    @Override
    public String toString() {
        return MyStack.toString();
    }
    
    //method to display stack
    public void displayStack(){
        if(MyStack.isEmpty()){
            System.out.println("----"+stack_name+"----");
            System.out.println("Empty stack");
        }else{
        System.out.println("----"+stack_name+"----");
        for(int i=MyStack.size()-1;i>=0;i--)
            System.out.println(i+" "+MyStack.get(i));
        }
    }
    
    //search for a person
    public boolean search(Person o){
        for(Person stack:MyStack){
            if(stack.equals(o))
                return true;
        }
        return false;
    }

    
}
