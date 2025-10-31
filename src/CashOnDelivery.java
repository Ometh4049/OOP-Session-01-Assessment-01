public class CashOnDelivery extends Payment {
    protected String deliveryAddress;

    public CashOnDelivery(double amount , String currency , String status ,String deliveryAddress){
        super(amount , currency , status);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void processPayment(){
        System.out.println("Cash will be collected at " + this.deliveryAddress);
    }


}
