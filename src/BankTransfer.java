public class BankTransfer extends Payment {
    public String bankName;
    public String accountNumber;
    public String referenceCode;

    public BankTransfer(double amount , String currency , String status , String bankName , String accountNumber , String referenceCode){
        super(amount , currency , status);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.referenceCode = referenceCode;
    }

    @Override
    public void processPayment(){
        System.out.println("Initiating bank transfer to" + this.bankName + "using account" + this.accountNumber + "with reference " + this.referenceCode);
        super.markAsCompleted();
    }
}
