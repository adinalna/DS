/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial_1;

/**
 *
 * @author adina
 */

public class Tuto1Q1 {
    public static void main(String[] args) {
        
        Telephone num1 = new Telephone ("03", "79676300");
        Telephone num2 = new Telephone ("03", "79676301");
        Telephone num3 = new Telephone ("03", "79676302");
        Telephone num4 = new Telephone ("03", "79676303");
        Telephone num5 = new Telephone ("03", "79676304");

        Telephone[] TeleNumArray = {num1,num2,num3,num4,num5};
        
        System.out.println(Telephone.numberOfTelephoneObject);
        for( int i=0; i<5; i++){
            System.out.println(TeleNumArray[i].makeFullNumber());
        }

    }
    
}
