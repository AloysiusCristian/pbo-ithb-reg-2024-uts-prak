package Model;

public class Ticket {
    private String ticketID, seatNumber;
    private ClassType_Enum classType;
    private TicketStatus_Enum status;
    private double price;
    private Train train;
    private OnlinePayment payment = new OnlinePayment();

    public Ticket(String ticketID, String seatNumber, ClassType_Enum classType, TicketStatus_Enum status,
            double price, Train train) {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.status = status;
        this.price = price;
        this.train = train;
    }

    public String getTicketID() {
        return ticketID;
    }
    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public ClassType_Enum getClassType() {
        return classType;
    }
    public void setClassType(ClassType_Enum classType) {
        this.classType = classType;
    }
    public TicketStatus_Enum getStatus() {
        return status;
    }
    public void setStatus(TicketStatus_Enum status) {
        this.status = status;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public OnlinePayment getPayment() {
        return payment;
    }
    public void setPayment(OnlinePayment payment) {
        this.payment = payment;
    }
    public Train getTrain() {
        return train;
    }
    public void setTrain(Train train) {
        this.train = train;
    }

    public String printTicket(){
        String data = "Ticket ID: " + this.ticketID +
        "\nSeat Number: " + this.seatNumber +
        "\nClass Type: " + this.classType +
        "\nStatus: " + this.status +
        "\nPrice: " + this.price;
        return data;
    }
}
