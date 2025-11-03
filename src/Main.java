import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CashOnDelivery cod = new CashOnDelivery(20000.00, "LKR", "PENDING", "TXN-1001","Colombo, Sri Lanka");
        BankTransfer bankTransfer = new BankTransfer(30000.00, "LKR", "PENDING", "TXN-1001","Commercial Bank", "123123123", "9111");
        CreditCardPayment ccPayment = new CreditCardPayment(40000.00, "USD", "PENDING","TXN-1001", "9823323209738012", "Ometh Chandrasekara", "09/27", 150000.00);
        DebitCardPayment dcPayment = new DebitCardPayment(50000.00, "INR", "PENDING","TXN-1001", "5273836412350901", "Virat Kohli", "07/29", 55000.00);


        ArrayList<Payment> allpayments = new ArrayList<>();
        allpayments.add(cod);
        allpayments.add(bankTransfer);
        allpayments.add(ccPayment);
        allpayments.add(dcPayment);

        for(Payment p : allpayments){
            p.processPayment();
            p.generateReceipt();

        }

        System.out.println();
        System.out.println();

        ArrayList<Payable> allpayables = new ArrayList<>();
        allpayables.add(cod);
        allpayables.add(bankTransfer);
        allpayables.add(ccPayment);
        allpayables.add(dcPayment);

        for(Payable playable : allpayables){
            playable.validate();
            playable.getReference();
        }


        System.out.println();
        System.out.println();

        ArrayList<Discount> alldiscounts = new ArrayList<>();

        alldiscounts.add(ccPayment);
        allpayments.add(dcPayment);

        for(Discount discount : alldiscounts){
            discount.applyDiscount(20);
            discount.finalAmount();
        }


    }
}