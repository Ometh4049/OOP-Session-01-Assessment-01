public class BankTransfer extends Payment {
    protected String accountNumber;
    protected String referenceCode;
    protected String bankName;

    public BankTransfer(double amount , String currency , String status, String referenceId , String bankName , String accountNumber , String referenceCode){
        super(amount , currency , status , referenceId);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.referenceCode = referenceCode;
    }

    @Override
    public void processPayment(){
        System.out.println("Processing Payment from Bank Transfer");
        System.out.println("Initiating bank transfer to " + this.bankName + " using account " + this.accountNumber + " with reference Id : " + super.referenceId);
        super.markAsCompleted();

    }

    @Override
    public boolean validate() {

        System.out.println("Validating Bank Transfer...");
        if(this.accountNumber==null || this.accountNumber.isEmpty()){
            System.out.println("Validation Failed");
            return false;
        }
        if(this.bankName==null || this.bankName.isEmpty()){
            System.out.println("Validation Failed");
            return false;
        }

        System.out.println("Validation Success");
        System.out.println();
        return true;
    }


}
