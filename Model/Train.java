package Model;

public class Train {
    private int trainNumber;
    private String trainName;
    private TrainType_Enum trainType;
    private boolean[] seatNumber = new boolean[20];

    public Train(int trainNumber, String trainName, TrainType_Enum trainType) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.trainType = trainType;
    }

    public int getTrainNumber() {
        return trainNumber;
    }
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    public String getTrainName() {
        return trainName;
    }
    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }
    public TrainType_Enum getTrainType() {
        return trainType;
    }
    public void setTrainType(TrainType_Enum trainType) {
        this.trainType = trainType;
    }
    public boolean[] getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(boolean[] seatNumber) {
        this.seatNumber = seatNumber;
    }
}
