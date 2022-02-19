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
public class Stack{
    String stack_name;
    ArrayList<Person>MyStack=new ArrayList<>();

    public Stack() {
    }
    
    
    public Stack(String stack_name) {
        this.stack_name = stack_name;
    }
    
    public void push(Person e){
        MyStack.add(e);
    }
    
    //1) public void push(E 0);
    public void push(String name, int age, String gender, String occupation, String illness ){
        Person newPerson = new Person(name,age,gender,occupation,illness);
        MyStack.add(newPerson);
    }
    
    //2) public E pop();
    public Person pop(){
        Person temp=MyStack.get(getSize()-1);
        MyStack.remove(getSize()-1);
        return temp;
    }
    
    //3) public E peek();
    public Person peek(){
        return MyStack.get(getSize()-1);
    }
    
    //4) public int getSize();
    public int getSize(){
        return MyStack.size();
    }
    
    //5) public boolean isEmpty();
    public boolean isEmpty(){
        return MyStack.isEmpty();
    }
    
    //6) public String toString();
    @Override
    public String toString() {
        return MyStack.toString();
    }
    
    //display stack method
    public void displayStack(){
        System.out.println("----"+stack_name+"----");
        if(MyStack.isEmpty())
            System.out.println("Empty Stack");
        for(int i=MyStack.size()-1;i>=0;i--){
            System.out.println(i+" "+MyStack.get(i));
        }
    }
   
    public ArrayList<Person>toArray(){
        ArrayList<Person>array=new ArrayList<>();
        for(int i=MyStack.size()-1;i>=0;i--)
            array.add(MyStack.get(i));
        return array;
    }
    
    //7) public boolean search(E o);
    public boolean search(Person o){
        for(Person stack:MyStack){
            if(stack.equals(o))
                return true;
        }
        return false;
    }
   
    
}
