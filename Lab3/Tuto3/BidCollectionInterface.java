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
public interface BidCollectionInterface {
    
    //Adds a bid to this collection.
    public void AddBid();
    
    //Returns the bid in this collection with the best yearly cost
    public double BestYearlyCost();
    
    /*Returns the bid in this collection with the best initial cost. The initial cost will be defined 
    as the unit cost plus the installation cost.*/
    public double BestInitialCost();
   
    //Clears all of the items from this collection.
    public void CollectionClear();
    
    //Gets the number of items in this collection.
    public double getNoOfItems();
    
    //Sees whether this collection is empty
    public boolean EmptyCollection();
}
