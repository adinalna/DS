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
public class Q2 {
    public static void main(String[] args) {
        
        //adding original data 
        SortSalesList[]list= {new SortSalesList("Asia",450,"Ahmad"),new SortSalesList("Europe",518,"Hemish"),
            new SortSalesList("Europe",650,"Banny"),new SortSalesList("Greenland",200,"Ain"),
            new SortSalesList("Asia",390,"Ali"),new SortSalesList("Greenland",670,"Ben"),
            new SortSalesList("Asia",790,"Lee")};
       
        //display original data
        System.out.println("Original Data:");
        for(SortSalesList e:list)
            System.out.println(e.toString());
        
        
        //Set the compare type of the list
        setListCompare(list,0);
        //Initialize new list for selection sort
        SortSalesList[]selectionList=SelectionSort(list);
        //display sorting result on region using SelectionSort
        System.out.println("\nSorting Result on Region uing SelectionSort:");
        for(SortSalesList e:selectionList)
            System.out.println(e.toString());
        
        //Set the compare type of the list
        setListCompare(list,1);
        //Initialize new list for insertion sort
        SortSalesList[]insertionList=InsertionSort(list);
        //display sorting result on sales amount using InsertionSort
        System.out.println("\nSorting Result on Sales uing InsertionSort:");
        for(SortSalesList e:insertionList)
            System.out.println(e.toString());
        
        //Set the compare type of the list
        setListCompare(list,2);
        //Initialize new list for bubble sort
        SortSalesList[]bubbleList=BubbleSort(list);
        //display sorting result on respresentative name using BubbleSort
        System.out.println("\nSorting Result on SalesRep uing BubbleSort:");
        for(SortSalesList e:bubbleList)
            System.out.println(e.toString());
    }
    
    public static void setListCompare(SortSalesList[]list, int compare) {
        for(SortSalesList e:list){
            e.setCompare(compare);
        }
    }
    
    public static SortSalesList[] SelectionSort(SortSalesList[]list){
        //Selection sort in descending order of region
        for (int i = 0; i < list.length - 1; i++) {
        // Find the minimum in the list[i..list.length-1]
            SortSalesList currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j])<0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }
    
     public static SortSalesList[] InsertionSort(SortSalesList[]list){
        //Insertion sort in ascending order of sales amount
        for(int i=1;i<list.length;i++){
            SortSalesList currentElement = list[i];
            int k;
            for(k=i-1;k>=0&&list[k].compareTo(currentElement)>0;k--){
                list[k+1]=list[k];
            }
            list[k+1]=currentElement;
        } 
        return list;
    }
     
    public static SortSalesList[] BubbleSort(SortSalesList[]list){
        //Bubble sort in ascending order of respresentative name
        boolean needNextPass = true;
        for(int k=1;k<list.length&&needNextPass;k++){
            needNextPass=false;
             for(int i=0;i<list.length-k;i++){
                if(list[i].compareTo(list[i+1])>0){
                    SortSalesList temp = list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                    needNextPass=true;
                }  
            }
        }
        return list;
    }
}
