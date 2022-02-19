package DS_Test;

import java.util.Scanner;
import java.util.ArrayList;

public class PrintPages {
    public static void main(String[] args) {
        SpecialLL<Integer> bookPage = new SpecialLL<>();
        ArrayList<Integer> selectedList;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting page: ");
        int start = input.nextInt();
        System.out.print("Enter number of pages: ");
        int page = input.nextInt();
        for (int i = start; i < start + page; i++) { 
            bookPage.addLast(i);}
        selectedList=bookPage.getEven();
        
        bookPage.printOdd();
        System.out.println();
        
        for (int n = selectedList.size() - 1; n >=0; n--) {
            System.out.print(" " + selectedList.get(n));
        }
        System.out.println();
    }
}