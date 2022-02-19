/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9_Q2;

/**
 *
 * @author adina
 */
public class Lab9_Q2 {
    public static void main(String[] args) {
        permute("","ABC");
    }
    public static void permute(String beginningString,String endingString){
       if(endingString.length()==1){
           System.out.println(beginningString+endingString);
       }else
           for(int i=0;i<endingString.length();i++){
               String newString = endingString.substring(0,i)+endingString.substring(i+1);
               permute(beginningString+endingString.charAt(i),newString);
           }
    }
    
   
}
