/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuto3;

/**
 *
 * @author adina
 */
public interface BidInterface {
    
    //Returns the name of the company making this bid.
    public String getCompanyName();
    
    //Returns the description of the air conditioner that this bid is for.
    public String setDescription();
    
    //Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
    public double BidCapicity();
    
    //Returns the seasonal efficiency of this bid's AC (SEER).
    public double SeasonalEfficiency();
    
    //Clears all of the items from this collection.
    public double CostBidAC();
    
    //Gets the number of items in this collection.
    public double InstallationCostAC();
    
    //Sees whether this collection is empty
    public double YearlyOperatingCost();
    
    
    
    
}
