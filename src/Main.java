//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CashOnDelivery cod = new CashOnDelivery(20000.00 , "LKR" , "PENDING","Colombo,Sri Lanka");
        BankTransfer banktranser = new BankTransfer(30000.00 , "LKR" ,"PENDING" , "Commercial Bank" , "123123123" ,"9111");
        CreditCardPayment ccpayment = new CreditCardPayment(40000.00 , "USD" , "PENDING" , "9823323209738012" , "Ometh Chandrasekara" , "09/27", 150000.00);
        DebitCardPayment dcpayment = new DebitCardPayment(50000.00 , "INR" , "PENDING" , "5273836412350901" , "Virat Kohli" , "07/29", 50000.00);

        cod.processPayment();
        banktranser.processPayment();
        ccpayment.processPayment();
        dcpayment.processPayment();




    }
}