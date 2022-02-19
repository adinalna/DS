/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5_Q2;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class StudentListTest {
    public static void main(String[] args) {
        
        //create and initialise the student list
        StudentList<String>List=new StudentList<>();
        
        //User enter all student names into the list using scanner class
        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your student name list. Enter 'n' to end.....");
        do{
            name=s.nextLine();
            if(!name.equals("n"))
                List.add(name);
        }while(!name.equals("n"));
        
        //Display all names entered
        System.out.println("You entered the following students' name :");
        List.printList();
        
        //Display the size of list
        System.out.println("The number of students entered: "+List.getSize());
        
        //User is give the option to rename names in tthe list or procced with
        //the current list     
        System.out.println("\nAll the names entered are correct? Enter 'r' "
                + "to rename the student name, 'n' to proceed.");
        char proceed=s.next().charAt(0);
        if(proceed=='r'){
            System.out.println("\nEnter the existing student name that you want to rename : ");
            s.nextLine();
            String oldName=s.nextLine();
            System.out.println("\nEnter the new name : ");
            String newName=s.nextLine();
            List.replace(oldName, newName);
        }
        //Display all new names entered
        System.out.println("The new student list is : ");
        List.printList();
            
        //The user is given the option to remove any names in the list
        
            System.out.println("Do want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
            char remove=s.next().charAt(0);
            if(remove=='y'){
                System.out.println("\nEnter a student name to remove : ");
                s.nextLine();
                String removeName=s.nextLine();
                List.removeElement(removeName);
            }         

        //Display the size of list
        System.out.println("\nThe number of updated students is : "+List.getSize());
        
        //Display the final updated names in the list
        System.out.println("The updated student list is  :");
        List.printList();
        
        //Tell the user all the data is captured and complete
        System.out.println("\nAll student data captured complete. Thank you!");
    }
}
