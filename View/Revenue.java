package View;

import java.util.Scanner;

import Controller.*;

public class Revenue {
    static Scanner scan = new Scanner(System.in);
    public static void calculateTotalRevenue(){
        System.out.print("\nInput Date (yyy-mm-dd):");
        String date = scan.nextLine();
        double revenue = Controller.Revenue.calculateTotalRevenue(date);
        showRevenue(revenue);
    }
    public static void showRevenue(double revenue){
        System.out.println();
        System.out.println("Revenue: " + revenue);
    }
}
