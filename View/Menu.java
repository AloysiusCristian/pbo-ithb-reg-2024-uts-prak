package View;

import java.util.Scanner;

import Model.Data;

public class Menu {
    static Scanner scan = new Scanner(System.in);

    public static void MainMenu(){
        Data.generateDummy();
        int menu = -1;
        while (menu != 0) {
            System.out.print("\nMenu \n0. Exit \n1. Make Payment \n2. Calculate Total Revenue \nChoose: ");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    Payment.makePayment();
                    break;
                case 2:
                    Revenue.calculateTotalRevenue();
                    break;
            }
        }
    }
}
