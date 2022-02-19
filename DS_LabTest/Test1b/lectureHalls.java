/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1b;

/**
 *
 * @author adina
 */
import java.util.ArrayList;
public class lectureHalls {
    public static void main(String[] args) {
        
        //Create an arraylist to list all lecture halls
        ArrayList<LectureHall>lectureList=new ArrayList<>();
        
        //Create an arraylist to list all the other items in Alpha lecture hall
        ArrayList<OtherItem>alphaOther=new ArrayList<>();
        //Initializations for alpha lecture hall
        alphaOther.add(new OtherItem("Projector","projects content",1));
        alphaOther.add(new OtherItem("Microphone","amplify voice",2));
        LectureHall Alpha = new LectureHall(alphaOther,"Alpha",200,1);
        
        //Create an arraylist to list all the other items in Beta lecture hall
        ArrayList<OtherItem>betaOther=new ArrayList<>();
        //Initializations for alpha lecture hall
        betaOther.add(new OtherItem("Projector","projects content",1));
        betaOther.add(new OtherItem("Microphone","amplify voice",2));
        LectureHall Beta = new LectureHall(betaOther,"Beta",250,1);
        
        //Add all the tutorial rooms in the arraylist
        lectureList.add(Alpha);
        lectureList.add(Beta);
        
        //Create an arraylist to list all tutorial rooms
        ArrayList<TutorialRoom>tutorialList=new ArrayList<>();
        
        //Create an arraylist to list all the other items in Gamma tutorial room
        ArrayList<OtherItem>gammaOther=new ArrayList<>();
        //Initializations for Gamma tutotial room
        gammaOther.add(new OtherItem("Projector","projects content",1));
        gammaOther.add(new OtherItem("Microphone","amplify voice",1));
        TutorialRoom Gamma = new TutorialRoom(gammaOther,"Gamma",30,1);
        
        //Create an arraylist to list all the other items in Delta tutorial room
        ArrayList<OtherItem>deltaOther=new ArrayList<>();
        //Initializations for Delta tutorial room
        deltaOther.add(new OtherItem("Projector","projects content",2));
        deltaOther.add(new OtherItem("Microphone","amplify voice",1));
        TutorialRoom Delta = new TutorialRoom(deltaOther,"Delta",30,1);
        
        //Add all the tutorials rooms in the arraylist
        tutorialList.add(Gamma);
        tutorialList.add(Delta);
        
        //Create an arraylist to list all lab rooms
        ArrayList<Lab>labList=new ArrayList<>();
        
        //Create an arraylist to list all the other items in Gamma tutorial room
        ArrayList<OtherItem>epsilonOther=new ArrayList<>();
        //Initializations for Epsilon lab room
        epsilonOther.add(new OtherItem("Projector","projects content",1));
        Lab Epsilon = new Lab(epsilonOther,"Epsilon",30,30);
        
        //Create an arraylist to list all the other items in Zeta lab room
        ArrayList<OtherItem>zetaOther=new ArrayList<>();
        //Initializations for Delta tutorial room
        zetaOther.add(new OtherItem("Projector","projects content",1));
        Lab Zeta = new Lab(zetaOther,"Zeta",35,25);
        
        //Add all the tutorials rooms in the arraylist
        labList.add(Epsilon);
        labList.add(Zeta);
        
        //Print the details for lecture hall “Alpha” and lab “Zeta”. 
        System.out.println(Alpha);
        System.out.println(Zeta);
        
        //Print the total number of seats in the Faculty
        int totalSeats = Alpha.seatsNo+Beta.seatsNo+Gamma.seatsNo+Delta.seatsNo+Epsilon.seatsNo+Zeta.seatsNo;
        System.out.println("\nTotal number of seats in the faculty: "+totalSeats);
        
        //Print the lecture hall name with the highest number of seats
        System.out.println("Lecture hall with highest number of seats: "+HighestSeats(lectureList).roomName);
        
        //Print the total number of computers in the Faculty
        int totalComp=Alpha.compNo+Beta.compNo+Gamma.compNo+Delta.compNo+Epsilon.compNo+Zeta.compNo;
        System.out.println("the total number of computers in the Faculty: "+totalComp);
        
        //Print the lab name with the highest number of computers.
        System.out.println("Lab with highest number of computers: "+HighestSeats(labList).roomName);
        
        //Print the largest room for each lecture hall, tutorial room and lab.
        System.out.println(LargestRoom(lectureList));
        System.out.println(LargestRoom(tutorialList));
        System.out.println(LargestRoom(labList));
        
        //Print the total number of microphones in the faculty.
        int totalMicrophone = alphaOther.get(1).itemNo+betaOther.get(1).itemNo+gammaOther.get(1).itemNo+deltaOther.get(1).itemNo;
        System.out.println("\nTotal number of microphones in the faculty: "+totalMicrophone);
        
        //Print the outcome of the comparison between 1st “other item” in room “Alpha” and 2nd “other item” in room “Beta”.
        if(alphaOther.get(0).name.equals(betaOther.get(1).name))
            System.out.println("\nThe 1st 'other item' in room Alpha and 2nd 'other item' in room Beta is the same");
        else
            System.out.println("\nThe 1st 'other item' in room Alpha and 2nd 'other item' in room Beta is different");
        
        //Print the outcome of the comparison between 1st “other item” in room “Delta” and 1st “other item” in room “Zeta”.
        if(deltaOther.get(0).name.equals(zetaOther.get(0).name))
            System.out.println("The 1st 'other item' in room Delta and 1st 'other item' in room Zeta is the same");
        else
            System.out.println("The 1st 'other item' in room Delta and 1st 'other item' in room Zeta is different");
    }
    //A generic method to return the room name with highest number of seats or computers.
    public static <E extends Room & Comparable<E>> E HighestSeats(ArrayList<E> room){
        E mostSeatsComp=room.get(0);
        for(E hall:room){
            if(hall.compareTo(mostSeatsComp)>0)
                mostSeatsComp=hall;
        }
        return mostSeatsComp;
    }
    
    public static <E extends Room & Comparable<E>> String LargestRoom(ArrayList<E> room){
            E room1=room.get(0);
            E largest=room.get(1);
            if(room1.compareTo(largest)==0){
                if(room1 instanceof LectureHall)
                    return "Both lecture halls have the same size.";
                else if(room1 instanceof TutorialRoom)
                    return "Both tutorial rooms have the same size.";
                else 
                     return"Both labs have the same size.";      
            }else if(room1.compareTo(largest)>0){
                largest=room1;
            }
            if(room1 instanceof LectureHall)
                return "Largest lecture hall: "+((LectureHall)largest).roomName;
            else if(room1 instanceof TutorialRoom)
                return "Largest tutorial room: "+((TutorialRoom)largest).roomName;
            else 
                return "Largest lab room: "+((Lab)largest).roomName;
            }
    }
    

