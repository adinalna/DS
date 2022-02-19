/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_AllQ;

/**
 *
 * @author adina
 */
public class ArrayBag<T> implements BagInterface<T>{
    private T bag[];
    private final int DEFAULT_CAPACITY=25;
    private int numberOfEntries=0;

    public ArrayBag() {
        bag = (T[]) new Object[DEFAULT_CAPACITY];
    }
    
    public ArrayBag(int capacity) {
        bag = (T[]) new Object[capacity];
    }

    
    //Gets the current number of entries in bag
    @Override
    public int getCurrentSize(){
        return numberOfEntries;
    }
    
    //Checks whether the bag is full
    @Override
    public boolean isFull(){
        return (numberOfEntries == bag.length);
    }
    
    @Override
    public boolean isEmpty(){
        return (numberOfEntries==0);
    }
    
    @Override
    public boolean add(T newEntry){
        boolean result = true;
        if (isFull()) { 
            result = false;
        }
        else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }
        return result;
    }
    
    @Override
    public T remove(){
        T result = removeEntry(numberOfEntries - 1);
        return result;
    }
    
    @Override
    public boolean remove(T anEntry){
        int index = getIndexOf(anEntry);
        T result = removeEntry(index);
        return anEntry.equals(result);
    } 

    
    private T removeEntry(int givenIndex) {
        T result = null;
        if (!isEmpty() && (givenIndex >= 0)) {
            result = bag[givenIndex]; // entry to remove
            numberOfEntries--;
            // replace entry to remove with last entry
            bag[givenIndex] = bag[numberOfEntries-1];
            bag[numberOfEntries-1] = null; // remove reference to last entry

        } // end if
        return result;
    }
    
    // Returns the index of the entry, if located, or -1 otherwise.
    private int getIndexOf(T anEntry) {
        int where = -1;
        boolean found = false;
        for (int index = 0; !found && (index < numberOfEntries); index++) {

            if (anEntry.equals(bag[index])) {
                found = true;
                where = index;
            } 
        } 
        // Assertion: If where > -1, anEntry is in the array bag, and it
        // equals bag[where]; otherwise, anEntry is not in the array
        return where;
    } 
    
    @Override
    public void clear(){
        bag=null;
    }
    
    @Override
    public int getFrequencyOf(T anEntry){
        int frequency=0;
        for(int i=0; i<numberOfEntries; i++){
            if(bag[i]==anEntry)
                frequency++;
        }
        return frequency;
    }
    
    @Override
    public boolean contains(T anEntry){
        boolean found=false;
        for(int i=0; i<numberOfEntries; i++)
            if(bag[i]==anEntry){
                found=true;
                break;
           }
        return found;
    }
    
    @Override
    public T[] toArray(){
        T[] result = (T[]) new Object[numberOfEntries]; 
        for (int i = 0; i < numberOfEntries; i++) {
            result[i] = bag[i];
        } // end for
        return result;
    }
    
    /**
     *
     * @param Bag
     * @return
     */
    @Override
    public BagInterface<T> union(BagInterface<String> Bag){
        int sizeOfUnionBag = Bag.getCurrentSize()
                + getCurrentSize();

        BagInterface<T> unionBag = new ArrayBag<>(sizeOfUnionBag);
        
        ArrayBag<T> otherBag = (ArrayBag<T>) Bag;
        int index;
        // add entries from this bag to the new bag
        for (index = 0; index < numberOfEntries; index++) {
            unionBag.add(bag[index]);
        }
        // add entries from the second bag to the new bag
        for (index = 0; index < otherBag.getCurrentSize(); index++) {
            unionBag.add(otherBag.bag[index]);
        }
        return unionBag;
    }
    
    //reread later
    @Override
    public  BagInterface<T> intersection(BagInterface<T> Bag){
        BagInterface<T> intersectionBag = new ArrayBag<>();
        ArrayBag<T> otherBag = (ArrayBag<T>) Bag;
        
        BagInterface<T> copyOfAnotherBag = new ArrayBag<>();
        int index;
        // copy the second bag
        for (index = 0; index < otherBag.numberOfEntries; index++) {
            copyOfAnotherBag.add(otherBag.bag[index]);
        } 

        // add to intersectionBag each item in this bag that matches an item in
        // anotherBag; once matched, remove it from the second bag
        for (index = 0; index < getCurrentSize(); index++) {
            if (copyOfAnotherBag.contains(bag[index])) {
                intersectionBag.add(bag[index]);
                copyOfAnotherBag.remove(bag[index]);
            } // end if
        } 
        return intersectionBag;
    }
    
    @Override
    public  BagInterface<T> difference(BagInterface<T> Bag){
         BagInterface<T> differenceBag = new ArrayBag<>();
        
        ArrayBag<T> otherBag = (ArrayBag<T>) Bag;
        int index;
        // copy this bag
        for (index = 0; index < numberOfEntries; index++) {
            differenceBag.add(bag[index]);
        }
        // remove the ones that are in anotherBag
        for (index = 0; index < otherBag.getCurrentSize(); index++) {
            if (differenceBag.contains(otherBag.bag[index])) {
                differenceBag.remove(otherBag.bag[index]);
            } 
        }
        return differenceBag;
    }
    
    //my own method to return an entry of a specific index
    @Override
    public T get(int index){
        return this.bag[index];
    }
    
    
    
}

