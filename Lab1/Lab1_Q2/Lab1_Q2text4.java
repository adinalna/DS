/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Q2;

/**
 *
 * @author adina
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lab1_Q2text4 {
    
    public static void main(String[] args) {
        
        try {
        Scanner in = new Scanner(new FileInputStream("text4.txt"));
        int numChar=0;
        char[]characters;
        String line;
        while (in.hasNextLine()){
            line=in.nextLine();
            characters=line.toCharArray();
            for(int i=0;i<characters.length;i++){
                if(characters[i]!='0'&&characters[i]!='1'&&characters[i]!='2'&&characters[i]!='3'
                   &&characters[i]!='4'&&characters[i]!='5'&&characters[i]!='6'&&characters[i]!='7'
                   &&characters[i]!='8'&&characters[i]!='9'){
                    System.out.print(characters[i]);
                    numChar++;
                }
            }
            System.out.println();
           }
        System.out.println("Number of characters: "+numChar);
        in.close();
        } catch (FileNotFoundException e) {
        System.out.println("File was not found"); 
        }

    }
}
