package Model;

public class OnlinePayment implements Payment_Interface{
    private String transactionID, paymentGateway;

    public OnlinePayment(){
        
    }
    public OnlinePayment(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }
    public String getPaymentGateway() {
        return paymentGateway;
    }
    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public double makePayment(){
        double pay = 0;
        return  pay;
    }
}
