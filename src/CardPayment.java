public class CardPayment extends Payment {
    protected String cardNumber;
    protected String cardHolderName;
    protected String expiryDate;

    public CardPayment(double amount , String currency , String status, String referenceId , String cardNumber , String cardHolderName , String expiryDate ){
        super(amount , currency , status , referenceId );
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment(){
        System.out.println("Processing Payment from Card Payment.");
        System.out.println("Authorizing card payment for " + this.cardHolderName);

    }


    @Override
    public boolean validate() {

        System.out.println("Validating Card Payment");
        if(this.cardNumber == null || this.cardNumber.isEmpty()){
            System.out.println("Validation Failed");
            return false;
        }
        if(this.expiryDate == null || this.expiryDate.isEmpty()){
            System.out.println("Validation Failed");
            return false;
        }

        System.out.println("Validation Success");
        System.out.println();
        return true;



    }


}
