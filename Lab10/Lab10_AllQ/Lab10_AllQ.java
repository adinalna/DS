/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10_AllQ;

/**
 *
 * @author adina
 */
public class Lab10_AllQ {
    public static void main(String[] args) {
        int[]arr1 = {45, 7, 2, 8, 19, 3};
        System.out.println("Selection Sort");
        for(int num:arr1)
            System.out.print(num+" ");
        //For Q1,2,3
        System.out.print("\nSort Smallest: ");
        selectionSortSmallest(arr1);
        System.out.print("\nSort Largest: ");
        selectionSortLargest(arr1);
        System.out.println("\n");
        
        //For Q4
        int[]arr2 = {90, 1, -5, 23, 12, 66};
        System.out.println("Insertion Sort");
        for(int num:arr2)
            System.out.print(num+" ");
        System.out.print("\nSort Smallest: ");
        insertionSort(arr2);
        System.out.println();
    }
    
    public static void selectionSortSmallest(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            int currentMin=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<currentMin){
                   currentMin=arr[j]; 
                   minIndex=j;
                }
            }
            //swap the min array with the current array position
            if(currentMin!=i){
                arr[minIndex]=arr[i];
                arr[i]=currentMin;
            }               
        }
        for(int num:arr)
            System.out.print(num+" ");
    }
    
    public static void selectionSortLargest(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int maxIndex = i;
            int currentMax=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>currentMax){
                   currentMax=arr[j]; 
                   maxIndex=j;
                }
            }
            //swap the min array with the current array position
            if(currentMax!=i){
                arr[maxIndex]=arr[i];
                arr[i]=currentMax;
            }               
        }
        for(int num:arr)
            System.out.print(num+" ");
    }
    
    public static void insertionSort(int[] list){
        for(int i=1;i<list.length;i++){
            int currentMin=list[i];
            int j;
            for(j=i-1; j>=0 && list[j]>currentMin;j--){ //list[j]>currentMin && j>=0 cannot??
                list[j+1]=list[j];
            }
            list[j+1]=currentMin;
        }
        for(int num:list)
            System.out.print(num+" ");
    }
}
