public abstract class Payment implements Payable {
    protected double amount;
    protected String currency;
    protected String status;
    protected String referenceId;




    public Payment(double amount , String currency , String status , String referenceId){
        this.amount = amount;
        this.currency = currency;
        this.status = status;
        this.referenceId = referenceId;
    }

    public abstract void processPayment();

    public void generateReceipt(){
        System.out.println("Receipt for amount " + this.amount + " in " + this.currency);
    }

    public void markAsCompleted(){
//        this.status = "COMPLETED";
        this.setStatus("COMPLETED");
        System.out.println("Status : " + this.status);
    }

    @Override
    public String getReference(){
        return this.referenceId;
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
