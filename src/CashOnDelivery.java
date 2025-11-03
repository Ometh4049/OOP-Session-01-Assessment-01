public class CashOnDelivery extends Payment {
    protected String deliveryAddress;

    public CashOnDelivery(double amount , String currency , String status , String referenceId ,String deliveryAddress){
        super(amount , currency , status , referenceId);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void processPayment(){
        System.out.println("Processing Payment from Cash On Delivery.");
        System.out.println("Cash will be collected at " + this.deliveryAddress);

    }


    @Override
    public boolean validate() {
        System.out.println("Validating delivery address...");

        if (this.deliveryAddress == null || this.deliveryAddress.isEmpty()) {
            System.out.println("Validation Failed");
            return false;
        }
        System.out.println("Validation Success");
        System.out.println();
        return true;
    }


}
