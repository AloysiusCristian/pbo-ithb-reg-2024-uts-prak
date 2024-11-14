package Model;

public class Passenger {
    private String passengerID, pasenggerName;
    private int pasenggerGender, pasenggerAge;
    
    public Passenger(String passengerID, String pasenggerName, int pasenggerGender, int pasenggerAge) {
        this.passengerID = passengerID;
        this.pasenggerName = pasenggerName;
        this.pasenggerGender = pasenggerGender;
        this.pasenggerAge = pasenggerAge;
    }

    public String getPassengerID() {
        return passengerID;
    }
    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }
    public String getPasenggerName() {
        return pasenggerName;
    }
    public void setPasenggerName(String pasenggerName) {
        this.pasenggerName = pasenggerName;
    }
    public int getPasenggerGender() {
        return pasenggerGender;
    }
    public void setPasenggerGender(int pasenggerGender) {
        this.pasenggerGender = pasenggerGender;
    }
    public int getPasenggerAge() {
        return pasenggerAge;
    }
    public void setPasenggerAge(int pasenggerAge) {
        this.pasenggerAge = pasenggerAge;
    }

    public String getPasanggerInfo(){
        String data = "Pasengger ID: " + this.passengerID +
        "\nPasengger Name: " + this.pasenggerName +
        "\nPasengger Gender: " + this.pasenggerGender +
        "\nPasengger Age: " + this.pasenggerAge;
        return data;
    }
}
