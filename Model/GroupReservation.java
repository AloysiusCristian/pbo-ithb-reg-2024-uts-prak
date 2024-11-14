package Model;

import java.sql.Date;

public class GroupReservation extends Reservation{
    private String groupName;
    private int numberofPassengers;

    public GroupReservation(String reservationID, Date reservationDate, Ticket ticket, Passenger passenger, String groupName,
            int numberofPassengers) {
        super(reservationID, reservationDate, ticket, passenger);
        this.groupName = groupName;
        this.numberofPassengers = numberofPassengers;
    }

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public int getNumberofPassengers() {
        return numberofPassengers;
    }
    public void setNumberofPassengers(int numberofPassengers) {
        this.numberofPassengers = numberofPassengers;
    }   
}