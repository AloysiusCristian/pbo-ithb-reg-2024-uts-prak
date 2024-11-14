package View;

import Controller.*;

public class Revenue {
    public static void calculateTotalRevenue(){
        double revenue = Controller.Revenue.calculateTotalRevenue();
        showRevenue(revenue);
    }
    public static void showRevenue(double revenue){
        System.out.println();
        System.out.println("Revenue: " + revenue);
    }
}
