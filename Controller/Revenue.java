package Controller;

import Model.*;

public class Revenue {
    public static double calculateTotalRevenue(String date){
        double revenue = 0;
        for (Reservation reservation : Data.listReservations) {
            Ticket ticket = reservation.getTicket();
            if (ticket.getStatus() == TicketStatus_Enum.PAID) {
                revenue += ticket.getPrice();
            }
        }
        return revenue;
    }
}
