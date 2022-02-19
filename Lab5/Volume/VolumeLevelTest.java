/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Volume;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class VolumeLevelTest {
    public static void main(String[] args) {
        
        VolumeLevelList<Integer>VList=new VolumeLevelList<>();
        VList.add(1);
        VList.add(2);
        VList.add(3);
        VList.add(4);
        VList.add(5);
        VList.displayForward();
        
        Scanner s = new Scanner(System.in);
        char nextV;
        int currentLevel;
        System.out.print("Enter current level: ");
        currentLevel=s.nextInt();
        VList.setCurrentlevel(currentLevel);
        System.out.println("Enter '+' to move forward, '-' to move backward channels "
                + "or 'r' to remain the current channel");
        do{
            nextV = s.next().charAt(0);
            System.out.println("Current channel: Level Volume "+VList.nextLevel(nextV));
        }while(nextV!='r');
    }
}
