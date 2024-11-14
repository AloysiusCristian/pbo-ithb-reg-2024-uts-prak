package Model;

import java.sql.Date;

public class Reservation {
    private String reservationID;
    private Date reservationDate;
    private Ticket ticket;
    private Passenger passenger;

    public Reservation(String reservationID, Date reservationDate, Ticket ticket, Passenger passenger) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
        this.ticket = ticket;
        this.passenger = passenger;
    }

    public String getReservationID() {
        return reservationID;
    }
    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }
    public Date getReservationDate() {
        return reservationDate;
    }
    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void reserveSeat(){
        Train train = ticket.getTrain();
        boolean[] seat = train.getSeatNumber();
        for (int i = 0; i < seat.length; i++) {
            if (seat[i] == false) {
                ticket.setSeatNumber("" + i);
            }
        }
    }

    public void cancelReservation(){
        ticket.setStatus(TicketStatus_Enum.CANCELED);
    }
}
