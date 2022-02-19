/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze;

import java.util.ArrayList;

/**
 *
 * @author adina
 */
//import java.util.Scanner;
public class Maze {
    public static void main(String[] args) {
        
        int[][]maze={{1,0,1,0,0},
                     {1,0,1,0,0},
                     {1,1,1,0,1},
                     {0,1,0,0,0},
                     {1,1,1,1,1}};
        Coordinate destination = new Coordinate(2,4);
        Stack<Coordinate>stack=mazePath(maze,destination,0,0);
        if(!stack.isEmpty()){
            System.out.println("PATH FOUND!");
            System.out.println(stack.toString());
        }else{
            System.out.println("NO PATH!");
        }
       
    }
    
    public static boolean contains(Stack stack,int x,int y){
        ArrayList<Coordinate>list=stack.toArrayList();
        boolean contain=false;
        for(Coordinate e:list){
            if(e.getX()==x&&e.getY()==y)
                contain=true;
        }
        return contain;
    }
        
    public static Stack<Coordinate> mazePath(int[][]maze, Coordinate destination, int startX, int startY){
        Stack<Coordinate>stack=new Stack<>();
        int x=startX,y=startY;     
        System.out.println("Starting at ("+x+","+y+")");
        stack.push(new Coordinate(x,y));
        boolean found = false;
        while(!found){
            //System.out.println("Current: ("+y+","+x+")");
            //go right
            if(y+1<=maze[0].length-1&&maze[x][y+1]>0&&!contains(stack,x,y+1)){
                System.out.println("go right");
                y++;
                stack.push(new Coordinate(x,y));//mazeArray[x][y++]
                System.out.println("Push: ("+x+","+y+")");
                System.out.println(stack.toString());
            //go down
            }else if(x+1<=maze.length-1&&maze[x+1][y]>0&&!contains(stack,x+1,y)){
                System.out.println("go down");
                x++;
                stack.push(new Coordinate(x,y));//mazeArray[x++][y]
                System.out.println("Push: ("+x+","+y+")");
                System.out.println(stack.toString());
            //go up
            }else if(x-1>=0&&maze[x-1][y]>0&&!contains(stack,x-1,y)){
                System.out.println("go up");
                x--;
                stack.push(new Coordinate(x,y));//mazeArray[x--][y]
                System.out.println("Push: ("+x+","+y+")");
                System.out.println(stack.toString());
            //go left
            }else if(y-1>=0&&maze[x][y-1]>0&&!contains(stack,x,y-1)){
                System.out.println("go left");
                y--;
                stack.push(new Coordinate(x,y));//mazeArray[x][y--]
                System.out.println("Push: ("+x+","+y+")");
                System.out.println(stack.toString());
            }else{
                maze[stack.peek().getX()][stack.peek().getY()]=-1;
                System.out.println("POP: "+stack.pop());
                if(stack.isEmpty()){
                    //no path
                    break;
                }
                x=stack.peek().getX();
                y=stack.peek().getY();
            }  
            if(stack.peek().getX()==destination.getX()&&stack.peek().getY()==destination.getY()){
                found=true;
            }
        }
        return stack;
    }
}
