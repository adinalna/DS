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
public class SalesList {
    String region,representativeName;
    Integer salesAmount;

    public SalesList() {
    }
    
    public SalesList(String region, Integer salesAmount, String representativeName) {
        this.region = region;
        this.representativeName = representativeName;
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        String output=String.format("%-12s", region);
        return output + salesAmount + " " + representativeName;
    }
    
    
}
