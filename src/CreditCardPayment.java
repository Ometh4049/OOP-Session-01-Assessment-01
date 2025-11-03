public class CreditCardPayment extends CardPayment implements Discount {
    protected double creditLimit;

    public CreditCardPayment(double amount , String currency , String status , String referenceId , String cardNumber , String cardHolderName , String expiryDate , double creditLimit){
        super(amount , currency , status ,referenceId, cardNumber , cardHolderName , expiryDate);
        this.creditLimit = creditLimit;
    }

    @Override
    public void processPayment(){
        System.out.println("Charging credit card with limit " + this.creditLimit + " for amount " + super.getAmount());
        super.markAsCompleted();

    }



    @Override
    public double applyDiscount(double percent) {
        double discountedValue = super.getAmount() * (percent/100.00);
        double netValue = super.getAmount() - discountedValue;
        super.setAmount(netValue);
        System.out.println("Net Amount is : " + netValue + " after adding " + percent + "% Discount in Credit Card for Reference : " + super.getReference());
        return super.getAmount();
    }

    @Override
    public double finalAmount() {
        return this.getAmount();
    }
}
