public class Payment {
    protected double amount;
    protected String currency;
    protected String status;


    public Payment(double amount , String currency , String status){
        this.amount = amount;
        this.currency = currency;
        this.status = status;
    }

    public void processPayment(){
        System.out.println("Processing generic payment...");
    }

    public void generateReceipt(){
        System.out.println("Receipt for amount " + this.amount + " in " + this.currency);
    }

    public void markAsCompleted(){
//        this.status = "COMPLETED";
        this.setStatus("COMPLETED");
        System.out.println(this.status);
    }

    public double getAmount(){
        return this.amount;
    }

    public String getCurrency(){
        return this.currency;
    }

    public String getStatus(){
        return this.status;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    public void setStatus(String status){
        this.status = status;
    }


}
