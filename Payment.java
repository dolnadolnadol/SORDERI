public class Payment{
    private String[] payment = {"QR", "Cash"};
    Payment(){

    }
    public void QRpayment(){
        System.out.println("\nFor Payment " + payment[0] + "\n" + "|||||| |||| ||||| || |||||||||");
    }
    public void Cashpayment(){
        System.out.println("\nFor Payment " + payment[1] + "\n" + "Give waiter a money");
    }
}