public class DebitCardPayment extends CardPayment implements Discount{

    public double availableBalance;

    public DebitCardPayment(double amount , String currency , String status ,String referenceId, String cardNumber , String cardHolderName , String expiryDate , double availableBalance){
        super(amount , currency , status , referenceId , cardNumber , cardHolderName , expiryDate);
        this.availableBalance = availableBalance;
    }

    @Override
    public void processPayment() {
        System.out.println("Debiting from account balance " + this.availableBalance +" for amount " + super.getAmount());
        super.markAsCompleted();

    }

    public void checkSufficientBalance(){
        System.out.println("Checking if balance covers amount");
    }

    @Override
    public double applyDiscount(double percent) {
        double discountedValue = super.getAmount() * (percent/100.00);
        double netValue = super.getAmount() - discountedValue;
        super.setAmount(netValue);
        System.out.println("Net Amount is : " + netValue + " after adding " + percent + "% Discount in Debit Card for Reference :  " + super.getReference());
        return super.getAmount();
    }

    @Override
    public double finalAmount() {
        return super.getAmount();
    }
}
