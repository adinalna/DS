/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2019;

/**
 *
 * @author adina
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;                                
public class Q3 {
    public static void main(String[] args) {
        
        for(int count=0;count<2;count++){ 
            String textFile;
            if(count==0){
                textFile="maze.txt";
            }else{
                textFile="noPathMaze.txt";
            }
            int[][]maze=null;
            Coordinate destination=null;
            try {
                Scanner inSize = new Scanner(new FileInputStream(textFile));
                int rowSize=0,columnSize;
                String columnInput="";
                while (inSize.hasNextLine()){
                    columnInput=inSize.nextLine();
                    rowSize++;
                }
                columnSize=columnInput.split(" ").length;
                inSize.close();
                //Initialize array for maze
                maze=new int[rowSize][columnSize];
                Scanner in = new Scanner(new FileInputStream(textFile));
                System.out.println("The Triwizard Maze:");
                while (in.hasNextLine()){
                    for(int i=0;i<rowSize;i++){
                        for(int j=0;j<columnSize;j++){
                            char mazeInput=in.next().charAt(0);
                            System.out.print(mazeInput+" ");
                            if(mazeInput=='c'){//c in ascii
                                maze[i][j]=1;
                                destination=new Coordinate(i,j);
                            }else{
                                maze[i][j]=Character.getNumericValue(mazeInput);
                            }   
                        }
                        System.out.println();
                    }
                }
                in.close();
                } catch (FileNotFoundException e) {
                System.out.println("File was not found"); 
                }
            /* to check the  maze array 
            for(int i=0;i<maze.length;i++){
                for(int j=0;j<maze[0].length;j++){
                    System.out.print(maze[i][j]+" ");
                }
                System.out.println();
            }
            */
            MazeStack<Coordinate>stack=mazePath(maze,destination,0,0);
            if(!stack.isEmpty()){
                System.out.print("\nHurray!! Harry found the Triwizard Cup at "+destination
                        + "\nThis is the path Harry has taken: ");
                System.out.println(stack.toString());
            }else{
                System.out.println("\nOh no!!! Harry could'nt find the Triwizard Cup!"
                        + "\nSomeone quickly gets Professor Dumbledore.");
            }
            System.out.println();
        }    
    }
    
    public static boolean coordinateInStack(MazeStack<Coordinate> stack,int x,int y){
        MazeStack<Coordinate>temp=stack.toStack();
        boolean contain=false;
        while(!temp.isEmpty()){
            Coordinate top=temp.pop();
            if(top.getX()==x&&top.getY()==y){
                contain=true;
                break;
            }
        }
        return contain;
    }
    
    public static MazeStack<Coordinate> mazePath(int[][]maze, Coordinate destination, int startX, int startY){
        MazeStack<Coordinate>stack=new MazeStack<>();
        int x=startX,y=startY;     
        stack.push(new Coordinate(x,y));
        boolean found = false;
        while(!found){
            //go right
            if(y+1<=maze[0].length-1&&maze[x][y+1]>0&&!coordinateInStack(stack,x,y+1)){
                y++;
                stack.push(new Coordinate(x,y));
            //go down
            }else if(x+1<=maze.length-1&&maze[x+1][y]>0&&!coordinateInStack(stack,x+1,y)){
                x++;
                stack.push(new Coordinate(x,y));
            //go up
            }else if(x-1>=0&&maze[x-1][y]>0&&!coordinateInStack(stack,x-1,y)){
                x--;
                stack.push(new Coordinate(x,y));
            //go left
            }else if(y-1>=0&&maze[x][y-1]>0&&!coordinateInStack(stack,x,y-1)){
                y--;
                stack.push(new Coordinate(x,y));
            //dead end
            }else{
                //Pop the top of the stack and convert maze coordinate to -1 
                // to avoid pushing it into the stack again
                maze[stack.peek().getX()][stack.peek().getY()]=-1;
                stack.pop();
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
