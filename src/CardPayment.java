public class CardPayment extends Payment {
    protected String cardNumber;
    protected String cardHolderName;
    protected String expiryDate;

    public CardPayment(double amount , String currency , String status , String cardNumber , String cardHolderName , String expiryDate){
        super(amount , currency , status);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment(){
        System.out.println("Authorizing card payment for " + this.cardHolderName);
    }

    public void validateCard(){
        System.out.println("Validating card number format...");
    }
}
