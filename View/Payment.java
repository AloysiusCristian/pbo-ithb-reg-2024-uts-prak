package View;

import Controller.*;
import java.util.Scanner;

public class Payment {
    static Scanner scan = new Scanner(System.in);

    public static String choosePaymentGateway() {
        System.out.print("\nPayment Method \nPayPal \nDOKU \nXendit \nChoose Method: ");
        String method = scan.nextLine();
        return method;
    }

    public static String chooseReservationID(){
        System.out.print("\nInput your reservationID: ");
        String reservationID = scan.nextLine();
        return reservationID;
    }

    public static String chooseConfirmation(){
        System.out.print("\nConfirmation \nPay \nCancel \nChoose Confirmation: ");
        String confirmation = scan.nextLine();
        return confirmation;
    }

    public static void makePayment(){
        String reservationID = chooseReservationID();
        String method = choosePaymentGateway();
        String confirmation = chooseConfirmation();
        String message = Controller.Payment.makePayment(reservationID, method, confirmation);
        showMessage(message);
    }

    public static void showMessage(String message){
        System.out.println();
        System.out.println(message);
    }
}
