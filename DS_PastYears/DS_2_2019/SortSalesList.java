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
public class SortSalesList extends SalesList implements Comparable<SortSalesList>{
    private int compare;

    public SortSalesList(String region, Integer salesAmount, String representativeName) {
        super(region, salesAmount, representativeName);
        //this.compare=compare;
    }

    public int getCompare() {
        return compare;
    }

    public void setCompare(int compare) {
        this.compare = compare;
    }
    
    @Override
    public int compareTo(SortSalesList o) {
        if(compare==0){
            if(this.region.compareTo(o.region)>0)
                return 1;
            else if(this.region.compareTo(o.region)<0)
                return -1;
            else return 0;
        }else if(compare==1){
            if(this.salesAmount.compareTo(o.salesAmount)>0)
                return 1;
            else if(this.salesAmount.compareTo(o.salesAmount)<0)
                return -1;
            else return 0;
        }else if(compare==2){
            if(this.representativeName.compareTo(o.representativeName)>0)
                return 1;
            else if(this.representativeName.compareTo(o.representativeName)<0)
                return -1;
            else return 0;
        }
        return 0;
    }
    
    
}
