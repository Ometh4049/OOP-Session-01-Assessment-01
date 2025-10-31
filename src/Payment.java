public class Payment {
    public double amount;
    public String currency;
    public String status;


    public Payment(double amount , String currency , String status){
        this.amount = amount;
        this.currency = currency;
        this.status = status;
    }

    public void processPayment(){
        System.out.println("Processing generic payment...");
    }

    public void generateReceipt(){
        System.out.println("Receipt for amount " + this.amount + "in " + this.currency);
    }

    public void markAsCompleted(){
        this.status = "COMPLETED";
        System.out.println(this.status);
    }


}
