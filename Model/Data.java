package Model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;

public class Data {
    static Random random = new Random();

    public static ArrayList<Train> listTrains = new ArrayList<Train>();
    public static ArrayList<Reservation> listReservations = new ArrayList<Reservation>();
    
    public static void generateDummy(){
        Train train1 = new Train(1001, "Standard Express", TrainType_Enum.STANDARD);
        train1.setSeatNumber(generateRandomSeatAvailability(random));
        listTrains.add(train1);
        Train train2 = new Train(1002, "Fast Rail", TrainType_Enum.FASTTRAIN);
        train2.setSeatNumber(generateRandomSeatAvailability(random));
        listTrains.add(train2);
        Train train3 = new Train(1003, "Local Standard", TrainType_Enum.STANDARD);
        train3.setSeatNumber(generateRandomSeatAvailability(random));
        listTrains.add(train3);
        Train train4 = new Train(1004, "Rapid Fast", TrainType_Enum.FASTTRAIN);
        train4.setSeatNumber(generateRandomSeatAvailability(random));
        listTrains.add(train4);
        Train train5 = new Train(1005, "Intercity Standard", TrainType_Enum.STANDARD);
        train5.setSeatNumber(generateRandomSeatAvailability(random));
        listTrains.add(train5);

        Passenger passenger1 = new Passenger("1", "Aloy", 0, 19);
        int seat = -1;
        for (int i = 0; i < train1.getSeatNumber().length; i++) {
            if (train1.getSeatNumber()[i] == false) {
                seat = i;
                break;
            }
        }
        Ticket ticket = new Ticket("1", "" + seat, ClassType_Enum.BUSINESS_CLASS, TicketStatus_Enum.AWAITING_PAYMENT, 250000, train1);
        Reservation reservation1 = new Reservation("1", new Date(0), ticket, passenger1);
        listReservations.add(reservation1);
    }

    public static boolean[] generateRandomSeatAvailability(Random random) {
        boolean[] seatNumber = new boolean[20];
        for (int i = 0; i < seatNumber.length; i++) {
            seatNumber[i] = random.nextBoolean();
        }
        return seatNumber;
    }
}
