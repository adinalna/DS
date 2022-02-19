/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoteControl;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class RemoteControlTest {
    public static void main(String[] args) {
        
        RemoteControl<String>Channels=new RemoteControl<>();
        Channels.add("Channel 1: Disney Channel :)");
        Channels.add("Channel 2: Nickelodeon");
        Channels.add("Channel 3: Cartoon Network");
        Channels.add("Channel 4: ESPN");
        Channels.add("Channel 5: Fox");
        Channels.displayForward();
        
        Scanner s = new Scanner(System.in);
        char next;
        System.out.println("Enter '+' to move forward, '-' to move backward channels "
                + "or 'r' to remain the current channel");
        do{
            next = s.next().charAt(0);
            System.out.println("Current channel: "+Channels.nextChannel(next));
        }while(next!='r');
        
    }
}
