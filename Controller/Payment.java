package Controller;

import Model.*;

public class Payment {
    public static String makePayment(String reservationID, String method, String confirmation){
        for (Reservation reservation : Data.listReservations) {
            if (reservation.getReservationID().equalsIgnoreCase(reservationID)) {
                Ticket ticket = reservation.getTicket();
                OnlinePayment payment = ticket.getPayment();
                payment.setPaymentGateway(method);
                if (confirmation.equalsIgnoreCase("pay")) {
                    ticket.setStatus(TicketStatus_Enum.PAID);
                    return "Pay success";
                }
                else{
                    ticket.setStatus(TicketStatus_Enum.CANCELED);
                    return "Cancel success";
                }
            }
        }
        return "Reservation not found";
    }
}
