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
public class Telephone {
    private String areaCode;
    private String number;
    static int numberOfTelephoneObject=0;
    
    public Telephone(String areaCode, String number){
	this.areaCode=areaCode;
	this.number=number;
        numberOfTelephoneObject++;
}
    //accessor
    public String getareaCode() {
        return areaCode;
    }

    public String getnumber() {
        return number;
    }
    
    //mutator
    public String setareaCode(String areaCode) {
        return this.areaCode=areaCode;
    }

    public String setnumber(String number) {
        return this.number= number;
    }
    
    public String makeFullNumber(){
        return areaCode+"-"+number;	
}

}
